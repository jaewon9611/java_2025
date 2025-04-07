package com.thejoa.boot002.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test1")
	@ResponseBody
	public String basic1() {return "hi";
	} // localhost:8282/boot2/test1
	
	@GetMapping("/test2")
	//@RequestMapping("/ex2")
	public String basic2() {
		return "test2";
	}//	localhost:8282/boot2/test2
}
