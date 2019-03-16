package com.gp_stu.pay.payport;

import java.util.HashMap;
import java.util.Map;

public class PayMentStrategy {

    private static final PayMent PAY_MENT = new AliPay();

    private static Map<String,PayMent> payMentMap = new HashMap<>();

    static {
        payMentMap.put(PayContent.ALI_PAY,new AliPay());
        payMentMap.put(PayContent.JD_PAY,new JDPay());
        payMentMap.put(PayContent.UNION_PAY,new UnionPay());
        payMentMap.put(PayContent.YI_PAY,new YiPay());
        payMentMap.put(PayContent.WECHAT_PAY,new WeChatPay());
    }

    public static PayMent getPayMent(String payKey){
        if(!payMentMap.containsKey(payKey)){
            return PAY_MENT;
        }
        return payMentMap.get(payKey);
    }
}
