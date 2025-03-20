package com.ian.javatospring01.discount;

import com.ian.javatospring01.member.Grade;
import com.ian.javatospring01.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RateDiscountPolicyTest {
    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 등급은 10% 할인이 적용되어야 한다.")
    void vipTest() {
        // given
        Member member = new Member(1L, "김이안", Grade.VIP);

        // when
        int discount = rateDiscountPolicy.discount(member, 2500);

        // then
        assertThat(discount).isEqualTo(250);
    }

    @Test
    @DisplayName("BASIC 등급은 할인이 적용되지 않는다.")
    void basicTest() {
        // given
        Member member = new Member(1L, "김이안", Grade.BASIC);

        // when
        int discount = rateDiscountPolicy.discount(member, 2500);

        // then
        assertThat(discount).isEqualTo(0);
    }

}