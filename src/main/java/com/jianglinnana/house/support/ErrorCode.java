package com.jianglinnana.house.support;
/**
 * @author jianglinnana
 */
public enum ErrorCode {

    OK("成功"),

    A0001("用户端错误"),
    ;

    private final String description;

    ErrorCode(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
