package com.etw.etwapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonEnum {
    SUCCESS("S", "성공했습니다."),
    FAIL("F")
    ;

    private String code;
    private String message;

    CommonEnum(String code){
        this.code = code;
    }
}
