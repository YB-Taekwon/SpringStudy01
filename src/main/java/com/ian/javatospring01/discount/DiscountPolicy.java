package com.ian.javatospring01.discount;

import com.ian.javatospring01.member.Member;

public interface DiscountPolicy {
    // return = 할인 금액
    int discount(Member member, int price);
}
