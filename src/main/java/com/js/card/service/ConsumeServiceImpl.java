package com.js.card.service;

import com.js.card.api.model.ConsumeManage;
import com.js.card.mapper.CardManageMapper;
import com.js.card.mapper.ConsumeManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class ConsumeServiceImpl {
    @Autowired
    ConsumeManageMapper consumeManageMapper;
    @Autowired
    CardManageMapper cardManageMapper;


    //更新消费记录,并扣款
    @Async
    @Transactional(rollbackFor = Exception.class)
    public ConsumeManage insertConsumeRecord(String sno, String behave, BigDecimal amount){
        ConsumeManage consumeManage=new ConsumeManage();
        consumeManage.setSno(sno);
        consumeManage.setBehave(behave);
        consumeManage.setAmount(amount);
        consumeManage.setConsumeTime(new Date());

        consumeManageMapper.insert(consumeManage);
        //扣款
        cardManageMapper.updateBalance(sno,amount);
        return consumeManage;
    }
}
