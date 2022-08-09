package com.etw.etwapi.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@Builder
public class ResponseMap<T> {
    private int code;
    private String message;
    private T data;


}
