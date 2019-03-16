package com.gp_stu.strategy;

public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团活动");
    }
}
