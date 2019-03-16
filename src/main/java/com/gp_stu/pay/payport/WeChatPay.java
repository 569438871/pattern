package com.gp_stu.pay.payport;

public class WeChatPay extends PayMent {
    @Override
    public String getName() {
        return "财付通";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
