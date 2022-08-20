package com.etw.etwapi.config;

import com.etw.etwapi.common.CustomException;
import com.etw.etwapi.dto.ResponseMap;
import com.etw.etwapi.enums.CommonEnum;
import com.etw.etwapi.model.Food;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
public class RestControllerAdviseConfig {

    @ExceptionHandler(CustomException.class)
    public ResponseMap<Food> FoodExceptionHandler(CustomException e){
        return ResponseMap.<Food>builder()
                .code(CommonEnum.FAIL.getCode())
                .message(e.getMessage())
                .build();
    }
}
