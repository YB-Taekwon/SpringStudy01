package com.ian.javatospring01;

import com.ian.javatospring01.member.*;

// 유닛 테스트 생성 전 테스트 코드
public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "김이안", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("newMember = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
