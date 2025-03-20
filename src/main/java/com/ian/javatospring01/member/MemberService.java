package com.ian.javatospring01.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long id);
}
