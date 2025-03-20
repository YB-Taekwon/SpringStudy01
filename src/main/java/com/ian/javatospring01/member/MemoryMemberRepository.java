package com.ian.javatospring01.member;

import java.util.HashMap;
import java.util.Map;

// 데이터베이스 확정이 안 됐기 때문에 자바 내에서 테스트하는 리포지토리
public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return store.get(id);
    }

}
