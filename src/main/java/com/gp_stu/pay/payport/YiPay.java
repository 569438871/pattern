package com.gp_stu.pay.payport;

public class YiPay extends PayMent {
    @Override
    public String getName() {
        return "翼支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 50;
    }
}
