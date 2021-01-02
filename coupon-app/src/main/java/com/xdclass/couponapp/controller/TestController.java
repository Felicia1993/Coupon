package com.xdclass.couponapp.controller;

import com.xdclass.couponapp.service.CouponService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private CouponService couponService;
    @RequestMapping("/test")
    public String test(Integer id) {
        return couponService.getUserById(id);
    }

    @RequestMapping("/test1")
    public String testQuery(String id) {
        if (id== null){
            return "";
        }
        return couponService.query();
    }


}
