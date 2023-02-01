package com.js.card.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BuyDto implements Serializable {
    private String sno;
    private String goodName;
    private Integer num;
}
