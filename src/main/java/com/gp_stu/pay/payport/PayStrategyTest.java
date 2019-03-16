package com.gp_stu.pay.payport;

import com.gp_stu.pay.MsgResult;
import com.gp_stu.pay.Order;

import java.util.Date;

public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1",new Date().getTime()+"",345.68);
        MsgResult msgResult = order.pay(PayContent.YI_PAY);
        System.out.println(msgResult);
    }
}
