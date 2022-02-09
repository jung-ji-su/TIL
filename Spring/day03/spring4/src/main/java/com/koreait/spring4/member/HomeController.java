package com.koreait.spring4.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// 기본요청, localhost:9090  으로 들어오면 여기를 호출
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
