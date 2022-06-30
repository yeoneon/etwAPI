package com.etw.etwapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseMap<T> {
    private int code;
    private String message;
    private T data;
}
