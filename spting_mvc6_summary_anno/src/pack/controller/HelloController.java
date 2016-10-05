package pack.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.model.HelloModel;


//두번째 방법
@Controller
@RequestMapping({"hello.do", "hi.do", "abc/world.do", "k*", "mbc", "sbs"})
public class HelloController{
	@Autowired
	private HelloModel helloModel;
	
	/*	
	@RequestMapping(method = RequestMethod.GET)
	protected ModelAndView abc() {
		String result = helloModel.getGreeting();
		
		ModelAndView modelAndView = new ModelAndView();	//포워드값 기본값		
		modelAndView.setViewName("hello");
		modelAndView.addObject("result", result);
		
		return modelAndView;
	}
	*/
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	protected Map<String, Object> abc() {	//map은 요청명이 즉 파일명이 된다. 모델과 통신
		String result = helloModel.getGreeting();
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("result", result);
		//view 파일명은 요청명과 동일하게 작성해 준다.
		return map;
	}
	*/
	
	@RequestMapping(method = RequestMethod.GET)
	protected Model abc(Model model) {	//map은 요청명이 즉 파일명이 된다. 모델과 통신
		String result = helloModel.getGreeting();
		
		model.addAttribute("result", result);
		//view 파일명은 요청명과 동일하게 작성해 준다.
		return model;
	}
}

