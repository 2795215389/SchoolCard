package com.js.card.controller;

import com.js.card.api.dto.DiningDto;
import com.js.card.api.dto.DiningDtoSouth;
import com.js.card.api.model.Canteen;
import com.js.card.api.model.ConsumeManage;
import com.js.card.api.model.Dishes;
import com.js.card.api.model.Window;
import com.js.card.api.response.BaseResponse;
import com.js.card.api.response.StatusCode;
import com.js.card.service.ICardService;
import com.js.card.service.IDiningService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiningController {
    private static final Logger log= LoggerFactory.getLogger(DiningController.class);
    private static final String prefixUrl="/dining";

    @Autowired
    IDiningService diningService;
    @Autowired
    ICardService cardService;

    @GetMapping(prefixUrl+"/canteens")
    public BaseResponse getAllCanteen(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Canteen> canteenList=diningService.getCanteen();
        if(canteenList!=null&&canteenList.size()>0){
            response=new BaseResponse(StatusCode.Success);
            response.setData(canteenList);
        }
        return response;
    }

    @GetMapping(prefixUrl+"/windowsAll")
    public BaseResponse getAllWindow(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Window> windowList=diningService.getAllWindow();
        if(windowList!=null&&windowList.size()>0){
            response=new BaseResponse(StatusCode.Success);
            response.setData(windowList);
        }
        return response;
    }

    //进入某食堂，查看其中窗口
    @GetMapping(prefixUrl+"/windows")
    public BaseResponse getWindows(@RequestParam("cno") String cno){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Window> windowList=diningService.getWindowByCno(cno);
        if(windowList!=null&&windowList.size()>0){
            response=new BaseResponse(StatusCode.Success);
            response.setData(windowList);
        }else{
            response.setData("错误原因：不存在编号为:"+cno+",的食堂");
        }
        return response;
    }

    @GetMapping(prefixUrl+"/dishesAll")
    public BaseResponse getAllDish(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Dishes>dishes=diningService.getAllDish();
        if(dishes!=null&&dishes.size()>0){
            response=new BaseResponse(StatusCode.Success);
            response.setData(dishes);
        }
        return response;
    }

    //进入某窗口查看其中菜品
    @GetMapping(prefixUrl+"/dishes")
    public BaseResponse getDishes(@RequestParam("window_no") String Wno){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Dishes>dishes=diningService.getAllDishByWno(Wno);
        if(dishes!=null &&dishes.size()>0){
            response=new BaseResponse(StatusCode.Success);
            response.setData(dishes);
        }else{
            response.setData("错误原因：不存在编号为:"+Wno+",的窗口");
        }
        return response;
    }


    @PostMapping(prefixUrl+"/eat")
    public  BaseResponse eat(@RequestBody DiningDto dto){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        ConsumeManage consumeManage=diningService.dining(dto);
        if(consumeManage!=null){
            response=new BaseResponse(StatusCode.Success);
            response.setData(consumeManage);
        }else{
            response.setData("就餐刷卡失败，错误信息参见日志！");
        }
        return response;
    }



    //跨区就餐
    @PostMapping(prefixUrl+"/eatSouth")
    public  BaseResponse eatSouth(@RequestBody DiningDtoSouth dto){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        try{
            cardService.wsCard(dto);
            diningService.eatSouth(dto);
            cardService.wsBack(dto);
            response=new BaseResponse(StatusCode.Success);
            response.setData("跨区就餐刷卡成功！");
        }catch (Exception e){
            response.setData("跨区就餐刷卡失败！");
        }finally {
            return response;
        }
    }
}
