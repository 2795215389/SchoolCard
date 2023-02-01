package com.js.card.service;


import com.js.card.api.dto.BuyDto;
import com.js.card.api.model.CardManage;
import com.js.card.api.model.ConsumeManage;
import com.js.card.api.model.Goods;
import com.js.card.api.model.GoodsExample;
import com.js.card.mapper.CardManageMapper;
import com.js.card.mapper.ConsumeManageMapper;
import com.js.card.mapper.GoodsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ShopServiceImpl implements IShopService {
    private static final Logger log= LoggerFactory.getLogger(ShopServiceImpl.class);
    @Autowired
    CardManageMapper cardManageMapper;
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    ConsumeServiceImpl consumeService;
    @Override
    public List<Goods> getAllGoods() {
        GoodsExample example=new GoodsExample();
        List<Goods>goods=goodsMapper.selectByExample(example);
        return goods;
    }

    @Override
    public ConsumeManage buy(BuyDto dto) {
        String sno=dto.getSno();

        //鲁棒
        CardManage cardManage=cardManageMapper.selectBySno(sno);
        if(cardManage==null){
            log.info("不存在学号为:{},的校园卡",sno);
            return null;
        }


        String goodName=dto.getGoodName();
        Integer num=dto.getNum();
        Goods goods=goodsMapper.selectByName(goodName);
        if(goods!=null){
            Integer stock=goods.getGoodStock();
            Double price=goods.getGoodPrice().doubleValue();
            if(stock>=num){
                Double allPay=num*price;
                Double balance=cardManageMapper.selectBalanceBySno(sno);

                //满足条件则生成消费记录，并返回该对象，反之返回为空
                if(balance>=allPay){
                    //扣款
                    ConsumeManage consumeManage=consumeService.insertConsumeRecord(sno,"购物",BigDecimal.valueOf(allPay));
                    //减少库存
                    goodsMapper.updateShopStock(goodName,BigDecimal.valueOf(num));
                    return consumeManage;
                }else {
                    log.info("卡中余额不足无法购买！");
                }
            }else {
                log.info("库存不足无法购买！");
            }
        }else{
            log.info("不存在名为:{},的商品",goodName);
        }
        return null;
    }

    @Override
    public List<Goods> getSouthGoods() {
        return goodsMapper.getSouthGoods();
    }


    //在南区超市购物
    @Override
    public void buySouth(BuyDto dto) {
        goodsMapper.buySouth(dto.getSno(),dto.getGoodName(),BigDecimal.valueOf(dto.getNum()));
    }
}
