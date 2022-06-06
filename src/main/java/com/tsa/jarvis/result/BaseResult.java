package com.tsa.jarvis.result;

/**
 * @author miaohui
 */
public class BaseResult {

    private Boolean success;

    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
