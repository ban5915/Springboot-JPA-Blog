package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 
//메모리에서 new 하는것은 아니고 특정 어노테이션이 붙어 있는 클래스 파일들을 ioc(new)
//해서 스프링 컨테이너에서 관리해준다.

@RestController 
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		
		return "<h1>hello spring boot</h1>";
	}

}
