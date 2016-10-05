package pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

import pack.model.HelloModel;

/*
	public class HelloController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
*/

//두번째 방법
public class HelloController extends AbstractController{
	private HelloModel helloModel;
	
	public void setHelloModel(HelloModel helloModel) {
		this.helloModel = helloModel;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String result = helloModel.getGreeting();
		
		//ModelAndView modelAndView = new ModelAndView("hello");	//포워드값 기본값
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("redirect:/hello.jsp");
		modelAndView.addObject("result", result);
		
		return modelAndView;
	}
}

