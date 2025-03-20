package com.ian.javatospring01.discount;

import com.ian.javatospring01.member.Grade;
import com.ian.javatospring01.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private final int DISCOUNT_PERCENTAGE = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
            return price * DISCOUNT_PERCENTAGE / 100;

        return 0;
    }
}
