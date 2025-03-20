package com.ian.javatospring01.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceImplTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void test() {
        // given
        Member member = new Member(1L, "김이안", Grade.VIP);
        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        // then
        assertThat(member).isEqualTo(findMember);
    }

}