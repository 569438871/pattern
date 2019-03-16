package com.gp_stu.pay.payport;

public class JDPay extends PayMent {
    @Override
    public String getName() {
        return "京东金融";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
