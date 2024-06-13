package com.commerce.common;

import java.net.HttpURLConnection;

/**
 * API 응답 결과
 */
public class DefaultResponse<T> {

    // 응답 코드
    private Integer status;
    // 응답 결과
    private T response;

    private DefaultResponse(Integer status) {
        this.status = status;
    }
    private DefaultResponse(Integer status, T response) {
        this.status = status;
        this.response = response;
    }

    public static <T> DefaultResponse<T> of (Integer status, T response) {
        return new DefaultResponse<T>(status, response);
    }

    public static <T> DefaultResponse<T> of (T response) {
        return new DefaultResponse<T>(HttpURLConnection.HTTP_OK, response);
    }

    public static <T> DefaultResponse<T> of (Integer status) {
        return new DefaultResponse<T>(status);
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public T getResponse() {
        return response;
    }
    public void setResponse(T response) {
        this.response = response;
    }

}
