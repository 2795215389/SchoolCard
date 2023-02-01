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
public class DiningDtoSouth implements Serializable {
    private String wname;
    private String sno;
    private String dishName;
    private Integer num;
}
