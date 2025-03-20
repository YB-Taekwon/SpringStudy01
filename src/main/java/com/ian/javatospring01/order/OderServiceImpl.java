package com.ian.javatospring01.order;

import com.ian.javatospring01.discount.DiscountPolicy;
import com.ian.javatospring01.member.Member;
import com.ian.javatospring01.member.MemberRepository;

public class OderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String productName, int productPrice) {
        // 1. 회원 정보 조회
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, productPrice);

        return new Order(memberId, productName, productPrice, discountPrice);
    }
}
