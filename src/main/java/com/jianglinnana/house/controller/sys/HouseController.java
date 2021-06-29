package com.jianglinnana.house.controller.sys;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jianglinnana.house.model.entity.sys.House;
import com.jianglinnana.house.model.entity.sys.HouseDetail;
import com.jianglinnana.house.model.entity.sys.User;
import com.jianglinnana.house.service.sys.HouseDetailService;
import com.jianglinnana.house.service.sys.HouseService;
import com.jianglinnana.house.service.sys.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @Autowired
    private HouseDetailService houseDetailService;

    @Autowired
    private UserService userService;

    @RequestMapping("listhouse")
    public String listHouse(Model model) {
        List<House> list = houseService.list();
        model.addAttribute("house", list);
        return "index";
    }

    @RequestMapping("/{houseId:\\d+}")
    public String housePage(Model model, @PathVariable("houseId") Integer houseId) {
        House house = houseService.getById(houseId);

        HouseDetail houseDetail = houseDetailService
                .getOne(new QueryWrapper<HouseDetail>().lambda()
                        .eq(HouseDetail::getHouseId, house.getId())
                        .last("LIMIT 1"));

        User admin = userService.getById(house.getAdminId());

        model.addAttribute("houseId", house);
        model.addAttribute("houseDetail", houseDetail);
        model.addAttribute("phone",admin.getPhoneNumber());
        return "houseDatil";
    }

    @RequestMapping("/select")
    public String selectHouseByName(Model model, @RequestParam(value = "info") String info) {
        List<House> list = houseService.list(new QueryWrapper<House>().lambda().like(House::getTitle, info));
        model.addAttribute("houseByName", list);
        return "house";
    }

}

