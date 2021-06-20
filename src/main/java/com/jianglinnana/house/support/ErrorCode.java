package com.jianglinnana.house.support;
/**
 * @author jianglinnana
 */
public enum ErrorCode {

    OK("成功"),

    A0001("用户端错误"),

    A0201("用户未登录"),

    A0203("用户不存在"),

    B0001("服务端错误"),
    ;

    private final String description;

    ErrorCode(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
