package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorldController{
	//@RequestMapping("/world*")
	@RequestMapping({"/world*", "/good"})	//web.xml로 통과할땐 확장자가 필요하지만, 파일명 자체를 부르고있을땐 필요없다.
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("worldController 수행");
		//return new ModelAndView("list");	// view 파일명 반환
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "어노 월드");		// 의미 : request.setAttibute("say", "버전충돌 문제넼ㅋㅋ");와 같은 의미
		modelAndView.setViewName("view2");
		return modelAndView;
	}
}
