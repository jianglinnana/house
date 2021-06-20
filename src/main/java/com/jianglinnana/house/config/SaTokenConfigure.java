package com.jianglinnana.house.config;

import cn.dev33.satoken.interceptor.SaRouteInterceptor;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author jianglinnana
 */
@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {

    /**
     * 添加 Spring MVC 生命周期拦截器，用于控制器方法调用和资源处理程序请求的预处理和后处理。
     * 拦截器可以注册以应用于所有请求或仅限于 URL 模式的子集。
     *
     * @param registry 映射拦截器列表
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SaRouteInterceptor((req, res, handler) -> SaRouter.match(Collections.singletonList("/**"),
                Arrays.asList("/user/doLogin", "/doc.html", "/webjars/**", "/swagger-resources", "/v2/api-docs"),
                StpUtil::checkLogin)));
    }
}
