package com.itheima.springboot.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@Value("${name}")
	private String name;
	
	
	@GetMapping("hello")
	public String hello(){
		
		System.out.println(name);
		
		return "Hello World";
	}
	
	
	/**
	 * 跳转页面
	 * 
	 *
	 */
	@GetMapping("/user")
	public String user(){
		
		
		return "html/user.html";
	}
	
	
	
}
