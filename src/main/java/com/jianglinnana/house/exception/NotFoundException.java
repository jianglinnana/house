package com.jianglinnana.house.exception;

import com.jianglinnana.house.support.ErrorCode;

/**
 * @author jianglinnana
 */
public class NotFoundException extends HouseApiException{

    public NotFoundException(ErrorCode errorCode, String message, String userPromptMsg) {
        super(errorCode, message, userPromptMsg);
    }

    public NotFoundException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
