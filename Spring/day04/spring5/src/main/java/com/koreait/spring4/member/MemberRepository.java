package com.koreait.spring4.member;

import java.util.List;

public interface MemberRepository {

	// 회원저장
	MemberDTO save(MemberDTO member);
	
	// 전체 찾기
	List<MemberDTO> findAll();
}
