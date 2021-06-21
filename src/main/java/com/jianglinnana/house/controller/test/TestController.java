package com.jianglinnana.house.controller.test;

import cn.dev33.satoken.stp.StpUtil;
import com.jianglinnana.house.exception.ServiceException;
import com.jianglinnana.house.security.Token;
import com.jianglinnana.house.support.ErrorCode;
import com.jianglinnana.house.support.ResponsePack;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jianglinnana
 */
@RestController
@ResponsePack
@Api(tags = "测试接口")
public class TestController {

    @GetMapping("/user/doLogin")
    public Token doLogin(@RequestParam("账号") String username,@RequestParam("密码") String password) {
        if ("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return new Token("登录成功");
        }else {
            throw new ServiceException(ErrorCode.A0203,"用户不存在","用户不存在");
        }
    }

    @GetMapping("/islogin")
    public Token isLogin(String username, String password) {
        return new Token("当前会话是否登录:" +StpUtil.isLogin());
    }

    @GetMapping("/doLogout")
    public boolean logout(String username,String password){
        if ("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.logoutByLoginId(10001);
            return true;
        }else {
            throw new ServiceException(ErrorCode.A0203,"用户不存在","用户不存在");
        }
    }

    @GetMapping("/open/limits")
    public boolean test(){
        return true;
    }
}
