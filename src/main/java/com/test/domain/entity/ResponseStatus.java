package com.test.domain.entity;

/**
 * Created by miaorf on 2016/6/21.
 */
public enum  ResponseStatus {
    Ok(200),Error(500);

    int status;

    ResponseStatus(int status){
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
