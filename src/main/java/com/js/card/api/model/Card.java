package com.js.card.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Card implements Serializable {
    private String sno;

    private String sname;

    private String sarea;

    private String sdepart;

    private String sclass;

}