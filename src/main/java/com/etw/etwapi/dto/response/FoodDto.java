package com.etw.etwapi.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FoodDto {
    private Long id;
    private String name;
    private int pickCount;
    private String imgPath;
}
