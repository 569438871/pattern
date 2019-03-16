package com.gp_stu.strategy;

public class PromotionTest {
    public static void main(String[] args) {
        test3();
    }

    private static void test3(){
        String promotionKey = Content.CASHBACK;

        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }

    private static void test2(){
        PromotionActivity promotionActivity = null;

        String promotionKey = "GROUP";

        if("GROUP".equals(promotionKey)){
            promotionActivity = new PromotionActivity(new GroupBuyStrategy());
        }else if("CASH".equals(promotionKey)){
            promotionActivity = new PromotionActivity(new CashBackStrategy());
        }else if("COUP".equals(promotionKey)){
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else{
            promotionActivity = new PromotionActivity(new EmptyStrategy());
        }

        promotionActivity.execute();
    }

    private static void test1(){
        PromotionActivity promotionActivity = new PromotionActivity(new CouponStrategy());
        promotionActivity.execute();
    }
}
