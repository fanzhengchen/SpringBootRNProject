package fzc.network.response;

import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * Created by mark on 17-1-19.
 */
public class BaseResponse<T> {
    private Integer code;
    private String message;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
