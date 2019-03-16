package com.gp_stu.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static final PromotionStrategy DEFAULT_PROMOTION_STRATEGY = new EmptyStrategy();

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(Content.COUNPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(Content.CASHBACK,new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(Content.GROUP,new GroupBuyStrategy());
    }

    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy==null?DEFAULT_PROMOTION_STRATEGY:promotionStrategy;
    }
}
