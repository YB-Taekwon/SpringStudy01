package com.ian.javatospring01.order;

import com.ian.javatospring01.member.Grade;
import com.ian.javatospring01.member.Member;
import com.ian.javatospring01.member.MemberService;
import com.ian.javatospring01.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OderServiceImplTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OderServiceImpl();

    @Test
    void test() {
        // given
        Long memberId = 1L;
        Member member = new Member(memberId, "김이안", Grade.VIP);

        // when
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "아메리카노", 2500);

        // then
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}