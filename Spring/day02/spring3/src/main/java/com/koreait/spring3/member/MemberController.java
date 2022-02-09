package com.koreait.spring3.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("member")
	public String getMember(Model model) {
		System.out.println("member controller!!");
		MemberDTO member = new MemberDTO(1, "자바학생", "01012345678");
		model.addAttribute("member", member);
		return "thymeleaf/member";
	}
	
	@RequestMapping("each")
	public String getEach(Model model) {
		List<MemberDTO> members = new ArrayList<>();
		
		MemberDTO member1 = new MemberDTO(1, "자바학생1", "01012345671");
		MemberDTO member2 = new MemberDTO(2, "자바학생2", "01012345672");
		MemberDTO member3 = new MemberDTO(3, "자바학생3", "01012345673");
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		model.addAttribute("memberList", members);
		
		return "thymeleaf/each";
	}
	
	@RequestMapping("switch")
	public String getSwitch(Model model) {
		model.addAttribute("username", "홍길동");
		return "thymeleaf/switch";
	}
}