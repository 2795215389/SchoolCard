package com.js.card.service;

import com.js.card.api.dto.BuyDto;
import com.js.card.api.model.ConsumeManage;
import com.js.card.api.model.Goods;

import java.util.List;

public interface IShopService {
    List<Goods> getAllGoods();
    ConsumeManage buy(BuyDto dto);
    List<Goods>getSouthGoods();
    void buySouth(BuyDto dto);
}
