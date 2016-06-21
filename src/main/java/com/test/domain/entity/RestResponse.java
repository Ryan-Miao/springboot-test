package com.test.domain.entity;

import java.io.Serializable;

/**
 * Created by miaorf on 2016/6/21.
 */
public class RestResponse<T> implements Serializable {
    private int status;
    private String msg="success";
    private T data;

    public int getStatus() {
        return status;
    }

    public RestResponse<T> setStatus(ResponseStatus status) {
        this.status = status.getStatus();
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public RestResponse<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public RestResponse<T> setData(T data) {
        this.data = data;
        return this;
    }
}
