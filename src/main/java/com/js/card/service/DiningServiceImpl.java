package com.js.card.service;

import com.js.card.api.dto.DiningDto;
import com.js.card.api.dto.DiningDtoSouth;
import com.js.card.api.model.*;
import com.js.card.mapper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DiningServiceImpl implements IDiningService {
    private static final Logger log= LoggerFactory.getLogger(DiningServiceImpl.class);

    @Autowired
    ConsumeServiceImpl consumeService;
    @Autowired
    CanteenMapper canteenMapper;
    @Autowired
    WindowMapper windowMapper;
    @Autowired
    DishesMapper dishesMapper;
    @Autowired
    CardManageMapper cardManageMapper;

    //展示食堂信息
    @Override
    public List<Canteen> getCanteen() {
        CanteenExample example=new CanteenExample();
        List<Canteen>canteens=canteenMapper.selectByExample(example);
        return canteens;
    }

    //查询所有窗口
    @Override
    public List<Window> getAllWindow() {
        WindowExample example=new WindowExample();
        List<Window>windows=windowMapper.selectByExample(example);
        return windows;
    }

    //查询指定食堂的窗口信息
    @Override
    public List<Window> getWindowByCno(String Cno) {
        WindowExample example=new WindowExample();
        example.createCriteria().andCnoEqualTo(Cno);
        List<Window>windows=windowMapper.selectByExample(example);
        return windows;
    }

    //查询所有菜品
    @Override
    public List<Dishes> getAllDish() {
        DishesExample example=new DishesExample();
        List<Dishes>dishes=dishesMapper.selectByExample(example);
        return dishes;
    }

    //查询指定窗口的菜品
    @Override
    public List<Dishes> getAllDishByWno(String Wno) {
        DishesExample example=new DishesExample();
        example.createCriteria().andWindowNoEqualTo(Wno);
        List<Dishes>dishes=dishesMapper.selectByExample(example);
        return dishes;
    }

    @Override
    public ConsumeManage dining(DiningDto dto) {
        String sno=dto.getSno();
        //鲁棒
        CardManage cardManage=cardManageMapper.selectBySno(sno);
        if(cardManage==null){
            log.info("不存在学号为:{},的校园卡",sno);
            return null;
        }

        String dishName=dto.getDishName();
        Integer num=dto.getNum();
        String cname=dto.getCname();
        String wname=dto.getWname();

        Window window=windowMapper.selectWindowByName(wname);
        String wno=window.getWindowNo();

        Dishes dishes=dishesMapper.getDishByName(dishName,wno);
        if(dishes!=null){
            Short stock=dishes.getDishStock();
            Double price=dishes.getDishPrice().doubleValue();
            if(stock>=num){
                Double allPay=num*price;
                Double balance=cardManageMapper.selectBalanceBySno(sno);
                if(allPay<=balance){
                    ConsumeManage consumeManage=consumeService.insertConsumeRecord(sno,"就餐", BigDecimal.valueOf(allPay));
                    //减少库存
                    dishesMapper.updateDishStock(dishName,num);
                    return consumeManage;
                }else{
                    log.info("余额不足无法购买！");
                }
            }else{
                log.info("该菜品库存不足无法购买！");
            }
        }else{
            log.info("该窗口不存在菜名为:{},的菜");
        }
        return null;
    }


    //南区就餐
    @Override
    public void eatSouth(DiningDtoSouth dto) {
        dishesMapper.eatSouth(dto.getWname(),dto.getSno(),dto.getDishName(),BigDecimal.valueOf(dto.getNum()));
    }

}
