package com.perasgal.farmback.response;

public interface Response<T> {

    public T getContent();

    public String getStatus();

}
