package com.jianglinnana.house.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jianglinnana
 */
@Configuration
@MapperScan("com.jianglinnana.house.dao.mapper")
public class MybatisPlusConfig {

}
