package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{
	
	private SharedData data;
	
	public void setData(SharedData data) {
		this.data = data;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView view = new ModelAndView();
		view.addObject("msg", "Hello" + data.getShared());
		view.setViewName("list");
		return view;
	}
}
