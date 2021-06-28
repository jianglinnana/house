package com.jianglinnana.house.controller.user;

import com.jianglinnana.house.model.entity.sys.House;
import com.jianglinnana.house.service.sys.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 路由控制器
 * @author jianglinnana
 */
@Controller
@RequestMapping("route")
public class RouteController {

    @Autowired
    private HouseService houseService;


    @RequestMapping("index")
    public String indexPage(Model model){
        List<House> list = houseService.list();
        model.addAttribute("house",list);
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

    @RequestMapping("house")
    public String houseDetailPage(){
        return "house";
    }

    @RequestMapping("phone")
    public String phonePage(){
        return "phone";
    }

    @RequestMapping("user")
    public String userPage(){
        return "user";
    }

    @RequestMapping("price")
    public String pricePage(){
        return "price";
    }

    @RequestMapping("houseDatil")
    public String houseDtailPage(){
        return "houseDatil";
    }


}
