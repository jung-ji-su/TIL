package com.koreait.spring4.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	//private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	private final MemberRepository memberRepository;
	
	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	
	// 회원가입
	public int join(MemberDTO member) {
		memberRepository.save(member);
		return member.getId();
	}
	
	// 전체 회원 조회
	public List<MemberDTO> findMembers(){
		return memberRepository.findAll();
	}
	
}