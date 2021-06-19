package com.jianglinnana.house.security;

import lombok.Data;

/**
 * Token
 * @author jianglinnana
 */
@Data
public class Token {

    private final String token;

    public Token(String token) {
        this.token = token;
    }
}
