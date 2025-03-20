package com.ian.javatospring01.order;

import com.ian.javatospring01.discount.DiscountPolicy;
import com.ian.javatospring01.discount.FixDiscountPolicy;
import com.ian.javatospring01.member.Grade;
import com.ian.javatospring01.member.Member;
import com.ian.javatospring01.member.MemberRepository;
import com.ian.javatospring01.member.MemoryMemberRepository;

public class OderServiceImpl implements OrderService {
    MemberRepository memberRepository = new MemoryMemberRepository();
    DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String productName, int productPrice) {
        // 1. 회원 정보 조회
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, productPrice);

        return new Order(memberId, productName, productPrice, discountPrice);
    }
}
