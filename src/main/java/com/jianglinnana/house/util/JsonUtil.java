package com.jianglinnana.house.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * @author violetfreesia
 * @date 2021-05-09
 */
public class JsonUtil {
    public static final JsonMapper MAPPER = new JsonMapper();

    static {
        MAPPER.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }


    /**
     * 将对象转为json字符串
     *
     * @param o 对象
     * @return json字符串
     */
    public static String toJsonString(Object o) throws JsonProcessingException {
        return MAPPER.writeValueAsString(o);
    }

    /**
     * 将json字符串转为对象
     *
     * @param json   json字符串
     * @param tClass 目标类Class
     * @param <T>    目标类型
     * @return 目标对象
     */
    public static <T> T parseObject(String json, Class<T> tClass) throws JsonProcessingException {
        return MAPPER.readValue(json, tClass);
    }
}
