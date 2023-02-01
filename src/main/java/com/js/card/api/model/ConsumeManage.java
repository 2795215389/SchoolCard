package com.js.card.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConsumeManage implements Serializable {
    private String sno;

    private String behave;

    private BigDecimal amount;

    private Date consumeTime;


}