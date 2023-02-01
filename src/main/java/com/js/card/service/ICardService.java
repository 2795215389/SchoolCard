package com.js.card.service;


import com.js.card.api.dto.BuyDto;
import com.js.card.api.dto.DiningDtoSouth;
import com.js.card.api.model.Card;
import com.js.card.api.model.CardManage;
import com.js.card.api.model.ConsumeManage;

import java.util.List;

//卡操作
public interface ICardService {
    List<Card> getAllStu();
    List<CardManage>getAllcard();
    List<CardManage>getAllSouth();
    CardManage getOne(String sno);
    List<ConsumeManage>getOneConsume(String sno);
    void registerCard(String sno);
    void wsCard(BuyDto dto);
    void wsBack(BuyDto dto);
    void wsCard(DiningDtoSouth dto);
    void wsBack(DiningDtoSouth dto);
    void rechargeCard(String sno,Double addAmount);
    void replaceCard(String sno);
    void deleteCard(String sno);
}
