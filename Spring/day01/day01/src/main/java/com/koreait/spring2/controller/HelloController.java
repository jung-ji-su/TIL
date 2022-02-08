package com.koreait.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data" ,"hellodata!!!!!");
		return "helloview";
	}
	
	// @RequestParam 은 옵션을 넣어줄 수 있다.
	// required : 파라미터값 필수 여부, true - 필수(default), false - 필수가 아님
	// defaultValue : 파라미터 값이 없을 경우 기본으로 들어갈 값
	@GetMapping("hello-mvc")
	public String helloMvc(@RequestParam(value  = "name", required = false, defaultValue = "required test") String name, 
							Model model) {
		model.addAttribute("name",name);
		return "hello-template";
	}
	
}
