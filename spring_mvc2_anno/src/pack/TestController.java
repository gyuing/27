package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController{
	@RequestMapping("index.do")	// 매핑을 어노테이션으로 걸어놓았기 때문에 메소드명은 어떻게 짓든 상관이없다. 어차피 실행함.
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("TestController 수행");
		//return new ModelAndView("list");	// view 파일명 반환
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("say", "버전충돌 문제넼ㅋㅋ");		// 의미 : request.setAttibute("say", "버전충돌 문제넼ㅋㅋ");와 같은 의미
		modelAndView.setViewName("list");
		return modelAndView;
	}
}
