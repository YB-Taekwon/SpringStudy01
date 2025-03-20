package com.ian.javatospring01.discount;

import com.ian.javatospring01.member.Grade;
import com.ian.javatospring01.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    // 고정 할인 금액
    private final int DISCOUNT_FIX_AMOUNT = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
            return DISCOUNT_FIX_AMOUNT;

        return 0;
    }
}
