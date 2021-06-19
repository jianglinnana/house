package com.jianglinnana.house.controller.test;

import cn.dev33.satoken.stp.StpUtil;
import com.jianglinnana.house.exception.ServiceException;
import com.jianglinnana.house.security.Token;
import com.jianglinnana.house.support.ErrorCode;
import com.jianglinnana.house.support.ResponsePack;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jianglinnana
 */
@RestController
@ResponsePack
@Api(tags = "测试接口")
public class TestController {

    @GetMapping("/dologin")
    public Token doLogin(String username, String password) {
        if ("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return new Token("登录成功");
        }else {
            int i = 1/0;
            return new Token("错误");
        }
    }

    @GetMapping("/islogin")
    public String isLogin(String username, String password) {
        return "当前会话是否登录:" +StpUtil.isLogin();
    }
}
