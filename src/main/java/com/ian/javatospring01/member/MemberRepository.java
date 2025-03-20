package com.ian.javatospring01.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long id);
}
