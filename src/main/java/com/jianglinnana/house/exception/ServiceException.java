package com.jianglinnana.house.exception;

import com.jianglinnana.house.support.ErrorCode;

/**
 * @author jianglinnana
 */
public class ServiceException extends HouseApiException {

    public ServiceException(ErrorCode errorCode, String message, String userPromptMsg) {
        super(errorCode, message, userPromptMsg);
    }
}
