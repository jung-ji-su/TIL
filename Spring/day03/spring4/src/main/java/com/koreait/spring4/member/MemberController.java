package com.koreait.spring4.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	
	// MemberController가 MemberService를 의존한다.
	//private final MemberService memberService = new MemberService();
	
	
	// 스프링 스럽게 작업하기
	// service Spring Container에 하나만 생성 및 등록 해서 같이 공유해서 쓸 수 있다.
	// Field Injection(필드 주입)
	//@Autowired private MemberService memberService;
	
	
	// Setter Injection(수정자 주입)
//	private MemberService memberService;
//	
//	@Autowired
//	public void setMemberService(MemberService memberService) {
//		this.memberService = memberService;
//	}
	
	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	
	@GetMapping(value = "/members/new")
	public String creatForm() {
		return "members/createMemberForm";
	}
	
	@PostMapping(value = "/members/new")
	public String create( MemberFormDTO form ) {
		MemberDTO member = new MemberDTO();
		member.setName(form.getName());
		
		memberService.join(member);
		
		// 홈 화면으로 돌린다.
		return "redirect:/";
	}
	
	
	@GetMapping("/members")
	public String list(Model model) {
		List<MemberDTO> members = memberService.findMembers();
		model.addAttribute("members",members);
		
		return "members/memberList";
	}
	
}