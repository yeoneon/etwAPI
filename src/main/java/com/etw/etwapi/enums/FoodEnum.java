package com.etw.etwapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum FoodEnum {
    MSG_ERR_FAIL_GET_FOOD_INFO("음식 정보가 없습니다."),
    MSG_ERR_IS_NOT_CORRECT_SIZE("음식 사이즈가 선택한 매칭 수 보다 작습니다.")
    ;

    private String msg;
}
