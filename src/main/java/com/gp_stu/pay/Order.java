package com.gp_stu.pay;

import com.gp_stu.pay.payport.PayMent;
import com.gp_stu.pay.payport.PayMentStrategy;

public class Order {
    private String uid;
    private String orderId;
    private double amout;

    public Order(String uid, String orderId, double amout) {
        this.uid = uid;
        this.orderId = orderId;
        this.amout = amout;
    }

    public MsgResult pay(String payKey){
        PayMent payMent = PayMentStrategy.getPayMent(payKey);
        return payMent.pay(this.uid,this.amout);
    }
}
