package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
@Controller
public class HelloController{

	@RequestMapping(value="hello.do", method=RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("helloController 수행");
		//return new ModelAndView("list");	// view 파일명 반환
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "헬로 수행 -- POST");		// 의미 : request.setAttibute("say", "버전충돌 문제넼ㅋㅋ");와 같은 의미
		modelAndView.setViewName("view1");
		return modelAndView;
	}
	
	@RequestMapping(value="hello.do", method=RequestMethod.GET)
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("helloController 수행");
		//return new ModelAndView("list");	// view 파일명 반환
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "헬로 수행 -- GET");		// 의미 : request.setAttibute("say", "버전충돌 문제넼ㅋㅋ");와 같은 의미
		modelAndView.setViewName("view1");
		return modelAndView;
	}
}
*/



@Controller
//@RequestMapping("hello")	//하나 일때
@RequestMapping({"hello*", "mbc/hi"})
public class HelloController{

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("helloController 수행");
		//return new ModelAndView("list");	// view 파일명 반환
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "헬로 수행 -- POST");		// 의미 : request.setAttibute("say", "버전충돌 문제넼ㅋㅋ");와 같은 의미
		modelAndView.setViewName("view1");
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("helloController 수행");
		//return new ModelAndView("list");	// view 파일명 반환
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "헬로 수행 -- GET");		// 의미 : request.setAttibute("say", "버전충돌 문제넼ㅋㅋ");와 같은 의미
		modelAndView.setViewName("view1");
		return modelAndView;
	}
}
