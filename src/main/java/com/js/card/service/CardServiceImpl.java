package com.js.card.service;

import com.js.card.api.dto.BuyDto;
import com.js.card.api.dto.DiningDtoSouth;
import com.js.card.api.model.*;
import com.js.card.mapper.CardManageMapper;
import com.js.card.mapper.CardMapper;
import com.js.card.mapper.ConsumeManageMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CardServiceImpl implements ICardService{

    private static final Logger log= LoggerFactory.getLogger(CardServiceImpl.class);
    @Autowired
    CardMapper cardMapper;
    @Autowired
    CardManageMapper cardManageMapper;
    @Autowired
    ConsumeManageMapper consumeManageMapper;
    @Override
    public List<Card> getAllStu() {
        CardExample example=new CardExample();
        List<Card>cards=cardMapper.selectByExample(example);
        return cards;
    }

    @Override
    public List<CardManage> getAllcard() {
        CardManageExample example=new CardManageExample();
        List<CardManage>cardManages=cardManageMapper.selectByExample(example);
        return cardManages;
    }

    @Override
    public List<CardManage> getAllSouth() {
        return cardManageMapper.getAllSouth();
    }

    @Override
    public CardManage getOne(String sno) {
        return cardManageMapper.selectBySno(sno);
    }


    //根据学号查询消费记录
    @Override
    public List<ConsumeManage> getOneConsume(String sno) {
        ConsumeManageExample example=new ConsumeManageExample();
        example.createCriteria().andSnoEqualTo(sno);
        return consumeManageMapper.selectByExample(example);
    }

    @Override
    public void registerCard(String sno){
//        try {
//            cardManageMapper.cardRegister(sno);
//        }catch (Exception e){
//            log.info("Service执行注册存储过程失败！");
//        }
        cardManageMapper.cardRegister(sno);
    }


    //将西区的卡信息copy到南区
    @Override
    public void wsCard(BuyDto dto) {
        cardManageMapper.wsCard(dto.getSno());
    }


    //将购物后的南区卡余额写回到西区
    @Override
    public void wsBack(BuyDto dto) {
        cardManageMapper.wsBack(dto.getSno());
    }

    @Override
    public void wsCard(DiningDtoSouth dto) {
        cardManageMapper.wsCard(dto.getSno());
    }

    @Override
    public void wsBack(DiningDtoSouth dto) {
        cardManageMapper.wsBack(dto.getSno());
    }

    @Override
    public void rechargeCard(String sno, Double addAmount) {
        BigDecimal inAdd=BigDecimal.valueOf(addAmount);
        cardManageMapper.cardRecharge(sno,inAdd);
    }

    @Override
    public void replaceCard(String sno) {
        cardManageMapper.cardReplace(sno);
    }

    @Override
    public void deleteCard(String sno) {
        cardManageMapper.cardDelete(sno);
    }
}
