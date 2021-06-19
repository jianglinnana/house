package com.jianglinnana.house.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.google.common.net.HttpHeaders;
import io.swagger.models.auth.In;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jianglinnana
 */

@Configuration
@EnableSwagger2
@EnableKnife4j
public class Knife4jConfiguration {

    @Bean
    public Docket apiManager() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("管理端API")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jianglinnana.house.controller"))
                .paths(PathSelectors.any())
                .build();
//                .securitySchemes(securitySchemes())
//                .securityContexts(securityContexts());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("rent-house文档")
                .description("房屋招租系统后台Api")
                .version("1.0.0")
                .contact(new Contact("jianglinnan", "http://121.5.156.190:8090", "jianglinnana@163.com"))
                .build();
    }

//    private List<SecurityScheme> securitySchemes() {
//        ApiKey username = new ApiKey("账号", "username", In.HEADER.toValue());
//        ApiKey password = new ApiKey("密码", "password", In.HEADER.toValue());
//        List<SecurityScheme> apiKeys = new ArrayList<>();
//        apiKeys.add(username);
//        apiKeys.add(password);
//        return apiKeys;
//    }
//
//    private List<SecurityContext> securityContexts() {
//        return Collections.singletonList(SecurityContext.builder()
//                .securityReferences(Collections.singletonList(new SecurityReference("认证参数",
//                        new AuthorizationScope[]{new AuthorizationScope("global", "")})))
//                .build()
//        );
//    }
}
