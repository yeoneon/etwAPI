package com.etw.etwapi.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@Builder
public class ResponseMap<T> {
    private String code;
    private String message;
    private T data;
}
