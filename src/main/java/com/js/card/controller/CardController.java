package com.js.card.controller;

import com.js.card.api.dto.RechargeDto;
import com.js.card.api.model.Card;
import com.js.card.api.model.CardManage;
import com.js.card.api.model.ConsumeManage;
import com.js.card.api.response.BaseResponse;
import com.js.card.api.response.StatusCode;
import com.js.card.service.ICardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {
    private static final Logger log= LoggerFactory.getLogger(CardController.class);
    private static final String prefixUrl="/card";


    @Autowired
    ICardService cardService;

    //查询操作
    //得到所有持卡人信息
    @GetMapping(prefixUrl+"/getAllStuInfo")
    public BaseResponse queryAllStu(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Card> cards=cardService.getAllStu();
        if(cards!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(cards);
        }
        return response;
    }


    //根据持卡人学号查询消费记录
    @GetMapping(prefixUrl+"/getOneConsume")
    public BaseResponse getOneConsume(@RequestParam("sno") String sno){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<ConsumeManage> consumeManages=cardService.getOneConsume(sno);
        if(consumeManages!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(consumeManages);
        }
        return response;
    }

    //查看所有校园卡信息----余额
    @GetMapping(prefixUrl+"/getAllCard")
    public BaseResponse getAllCard(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<CardManage> cards=cardService.getAllcard();
        if(cards!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(cards);
        }
        return response;
    }


    //查看所有南区校园卡信息----余额
    @GetMapping(prefixUrl+"/getAllSouthCard")
    public BaseResponse getAllSouthCard(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<CardManage> cards=cardService.getAllSouth();
        if(cards!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(cards);
        }
        return response;
    }

    //得到某学生的校园卡信息
    @GetMapping(prefixUrl+"/getOneCard")
    public BaseResponse getOne(@RequestParam("sno")String sno){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        CardManage cards=cardService.getOne(sno);
        if(cards!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(cards);
        }
        return response;
    }


    @GetMapping(prefixUrl+"/register")
    public BaseResponse reigsterCard(@RequestParam("sno") String sno){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            cardService.registerCard(sno);
            response.setData("学生:"+sno+",注册成功!");
        }catch (Exception e){
            response=new BaseResponse(StatusCode.Failed);
            response.setData("注册失败!");
            log.info("执行注册存储过程失败！");
        }finally {
            return response;
        }
    }

    @GetMapping(prefixUrl+"/recharge")
    public BaseResponse rechargeCard(RechargeDto dto){
        String sno=dto.getSno();
        Double addAmount=dto.getAddAmount();
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            cardService.rechargeCard(sno,addAmount);
            response.setData("学生:"+sno+",充值成功!");
        }catch (Exception e){
            response=new BaseResponse(StatusCode.Failed);
            response.setData("充值失败!");
            log.info("执行充值存储过程失败！");
        }finally {
            return response;
        }
    }

    @GetMapping(prefixUrl+"/replace")
    public BaseResponse replaceCard(@RequestParam("sno") String sno){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            cardService.replaceCard(sno);
            response.setData("学生:"+sno+",挂失补办成功!");
        }catch (Exception e){
            response=new BaseResponse(StatusCode.Failed);
            response.setData("挂失补办失败!");
            log.info("执行补办存储过程失败！");
        }finally {
            return response;
        }
    }


    @GetMapping(prefixUrl+"/delete")
    public BaseResponse deleteCard(@RequestParam("sno") String sno){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            cardService.deleteCard(sno);
            response.setData("学生:"+sno+",销户成功!");
        }catch (Exception e){
            response=new BaseResponse(StatusCode.Failed);
            response.setData("销户失败!");
            log.info("执行销户存储过程失败！");
        }finally {
            return response;
        }
    }


}
