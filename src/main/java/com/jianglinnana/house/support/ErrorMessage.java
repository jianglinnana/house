package com.jianglinnana.house.support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianglinnana
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {


    /**
     * 错误码
     */
    private ErrorCode errorCode;

    /**
     * 调试信息
     */
    private String devMessage;

    /**
     * 用户提示信息
     */
    private String userPromptMsg;
}
