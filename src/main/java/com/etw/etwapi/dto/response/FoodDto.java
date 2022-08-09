package com.etw.etwapi.dto.response;

import com.etw.etwapi.model.Food;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class FoodDto {
    private Long id;
    private String name;
    private int pickCount;
    private String imgPath;

    public FoodDto(Food food) {
        this.id = food.getId();
        this.name = food.getName();
        this.pickCount = food.getPickCount();
        this.imgPath = food.getImgPath();
    }
}
