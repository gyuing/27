package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("world");
		//return new ModelAndView("list");	// view 파일명 반환
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "멍청이동규");		// 의미 : request.setAttibute("say", "버전충돌 문제넼ㅋㅋ");와 같은 의미
		modelAndView.setViewName("view2");
		return modelAndView;
	}
}
