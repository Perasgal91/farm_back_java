package com.perasgal.farmback.response;


public class DefaultResponse<T> implements Response<T> {

    private T content;

    private String status = "SUCCESS";

    public DefaultResponse() {
        super();
    }

    public DefaultResponse(final T cont, String status) {
        super();

        content = cont!=null?cont: (T) "";
        this.status = status;
    }

    @Override
    public T getContent() {
        return content;
    }

    @Override
    public String getStatus() {
        return status;
    }
}
