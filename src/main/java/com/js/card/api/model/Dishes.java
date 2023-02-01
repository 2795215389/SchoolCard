package com.js.card.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dishes implements Serializable {
    private String dishNo;

    private String dishName;

    private BigDecimal dishPrice;

    private Short dishStock;

    private String windowNo;

}