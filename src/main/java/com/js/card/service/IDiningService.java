package com.js.card.service;

import com.js.card.api.dto.DiningDto;
import com.js.card.api.dto.DiningDtoSouth;
import com.js.card.api.model.Canteen;
import com.js.card.api.model.ConsumeManage;
import com.js.card.api.model.Dishes;
import com.js.card.api.model.Window;

import java.util.List;

public interface IDiningService {
    List<Canteen> getCanteen();
    List<Window>getAllWindow();
    List<Window>getWindowByCno(String Cno);
    List<Dishes>getAllDish();
    List<Dishes>getAllDishByWno(String Wno);

    ConsumeManage dining(DiningDto dto);
    void eatSouth(DiningDtoSouth dto);
}
