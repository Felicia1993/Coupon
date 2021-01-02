package com.xdclass.couponapp.service;

import com.xdclass.couponapp.mapper.TCouponMapper;
import com.xdclass.couponapp.model.TCoupon;
import com.xdclass.couponapp.model.TCouponExample;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CouponService {
    @Resource
    private TCouponMapper tCouponMapper;

    public void print() {
        System.err.println("enter coupon service");
    }

    @Reference
    private IUserService iUserService;
    public String query() {
        TCouponExample example = new TCouponExample();
        example.createCriteria().andCodeEqualTo("004515d96-49bd-4cce-83e3-08302b9aa084").andStatusEqualTo(0)
                .andAchieveAmountBetween(100,1000);
        List<TCoupon> tCou = tCouponMapper.selectByExample(example);
        return tCou.get(0).toString();
    }

    public String getUserById(int id) {
        return iUserService.getUserById(id);
    }
}
