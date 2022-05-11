package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링은 com.cos.Blog 패키지 내부의 모든 파일 중 특정 어노테이션이 붙은 클래스 파일을
// new하여 (제어 역전) 스프링 컨테이너에 관리한다.
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
