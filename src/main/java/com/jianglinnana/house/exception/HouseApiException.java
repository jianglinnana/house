package com.jianglinnana.house.exception;

import com.jianglinnana.house.support.ErrorCode;

import java.util.function.Supplier;

/**
 * 全局异常
 *
 * @author jianglinnana
 */
public class HouseApiException extends RuntimeException implements Supplier<HouseApiException> {


    /**
     * 错误码
     */
    private final ErrorCode errorCode;

    /**
     * 用户提示信息，若是抛向用户的异常，该字段不允许为空
     */
    private final String userPromptMsg;

    public HouseApiException(ErrorCode errorCode, String message, String userPromptMsg) {
        super(message);
        this.errorCode = errorCode;
        this.userPromptMsg = userPromptMsg;
    }

    @Override
    public HouseApiException get() {
        return this;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }

    public String getUserPromptMsg(){
        return userPromptMsg;
    }
}
