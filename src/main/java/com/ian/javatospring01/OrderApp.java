package com.ian.javatospring01;

import com.ian.javatospring01.member.Grade;
import com.ian.javatospring01.member.Member;
import com.ian.javatospring01.member.MemberService;
import com.ian.javatospring01.member.MemberServiceImpl;
import com.ian.javatospring01.order.OderServiceImpl;
import com.ian.javatospring01.order.Order;
import com.ian.javatospring01.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "김이안", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "아메리카노", 2500);

        System.out.println("order = " + order);
        System.out.println("calculateDiscount = " + order.calculateDiscount());
    }
}
