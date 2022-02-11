package com.koreait.spring4.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

//@Repository
public class MemoryMemberRepository implements MemberRepository {
	
	// 메모리 사용
	private static Map<Integer, MemberDTO> store = new HashMap<>();
	private static int sequence = 0;

	// 회원 저장
	@Override
	public MemberDTO save(MemberDTO member) {
		System.out.println("MemoryMemberRepository save 호출");
		member.setId(++sequence);
		store.put(member.getId(), member);
		return member;
	}

	// 회원 리스트
	@Override
	public List<MemberDTO> findAll() {
		return new ArrayList<>(store.values());
	}

}