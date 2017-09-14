package top.yhcj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.yhcj.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;
	@RequestMapping("/test.do")
	public String test(HttpSession session){
		session.setAttribute("haha", "hehe");
		return "index";
	}
	
	@RequestMapping("/testSession.do")
	public String testSession(){
		return "index";
	}
}
