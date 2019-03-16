package com.gp_stu.strategy;

public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("优惠券活动");
    }
}
