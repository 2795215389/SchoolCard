package com.js.card.controller;


import com.js.card.api.dto.BuyDto;
import com.js.card.api.model.Card;
import com.js.card.api.model.ConsumeManage;
import com.js.card.api.model.Goods;
import com.js.card.api.response.BaseResponse;
import com.js.card.api.response.StatusCode;
import com.js.card.service.ICardService;
import com.js.card.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {
    private static final String prefixUrl="/shop";

    @Autowired
    IShopService shopService;
    @Autowired
    ICardService cardService;

    //查询操作
    //得到所有商品信息
    @GetMapping(prefixUrl+"/getAllGoods")
    public BaseResponse queryAllStu(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Goods> goods=shopService.getAllGoods();
        if(goods!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(goods);
        }
        return response;
    }


    @GetMapping(prefixUrl+"/southGoods")
    public BaseResponse querySouthGoods(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Goods> goods=shopService.getSouthGoods();
        if(goods!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(goods);
        }
        return response;
    }


    @PostMapping(prefixUrl+"/buy")
    public BaseResponse purchase(@RequestBody BuyDto dto){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        ConsumeManage consumeManage=shopService.buy(dto);
        if(consumeManage!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(consumeManage);
        }else{
            response.setData("购买失败，错误信息参见日志！");
        }
        return response;
    }



    //跨校区购买服务
    @PostMapping(prefixUrl+"/buySouth")
    public BaseResponse purchaseSouth(@RequestBody BuyDto dto){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        try{
            cardService.wsCard(dto);
            shopService.buySouth(dto);
            cardService.wsBack(dto);
            response=new BaseResponse(StatusCode.Success);
            response.setData("跨区购买服务成功！");
        }catch (Exception e){
            response.setData("跨区购买服务失败！");
            e.printStackTrace();
        }finally {
            return response;
        }
    }
}
