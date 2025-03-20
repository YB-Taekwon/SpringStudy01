package com.ian.javatospring01;

import com.ian.javatospring01.discount.RateDiscountPolicy;
import com.ian.javatospring01.member.MemberService;
import com.ian.javatospring01.member.MemberServiceImpl;
import com.ian.javatospring01.member.MemoryMemberRepository;
import com.ian.javatospring01.order.OderServiceImpl;
import com.ian.javatospring01.order.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
    }
}
