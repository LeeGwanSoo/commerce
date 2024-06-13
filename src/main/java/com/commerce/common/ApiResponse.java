package com.commerce.common;

import lombok.*;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private boolean status;
    private Integer resultCode;
    private String message;
    private T data;
}