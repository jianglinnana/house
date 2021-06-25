package com.jianglinnana.house.controller.sys;


import com.jianglinnana.house.model.entity.sys.House;
import com.jianglinnana.house.service.sys.HouseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 房屋信息表 前端控制器
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Controller
@Api(tags = "房屋信息表 前端控制器")
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping("listhouse")
    public String listHouse(Model model) {
        List<House> list = houseService.list();
        model.addAttribute("house",list);
        return "index";
    }

    @RequestMapping("/{houseId:\\d+}")
    public String housePage(Model model,@PathVariable("houseId") Integer houseId){
        House house = houseService.getById(houseId);
        model.addAttribute("houseId",house);
        return "house";
    }

}

