package com.jianglinnana.house.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 路由控制器
 * @author jianglinnana
 */
@Controller
@RequestMapping("route")
public class RouteController {

    @RequestMapping("index")
    public String indexPage(){
        return "index";
    }

    @RequestMapping("rent")
    public String rentPage(){
        return "rent";
    }

    @RequestMapping("landlord")
    public String landlordPage(){
        return "landlord";
    }

    @RequestMapping("loginStatus")
    public String loginStatusPage(){
        return "loginStatus";
    }


}
