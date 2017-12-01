package com.giant.egiant.common;

import org.springframework.data.domain.Page;

/**
 * @author by chhai.chivon  on 12/1/17.
 */
public class Response<T> {
    private Page<T> data;

    public Page<T> getData() {
        return data;
    }

    public void setData(Page<T> data) {
        this.data = data;
    }
}