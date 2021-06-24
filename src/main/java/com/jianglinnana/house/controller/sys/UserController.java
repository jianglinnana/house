package com.jianglinnana.house.controller.sys;


import com.jianglinnana.house.model.entity.sys.User;
import com.jianglinnana.house.service.sys.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import java.util.List;

/**
 * <p>
 * 用户基本信息表 前端控制器
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Controller
@Api(tags = "用户基本信息表 前端控制器")
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String thymeleafDemo(){
        return "index";
    }

}

