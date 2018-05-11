package webappgroup.webappatifact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class App {
	@RequestMapping("/test")
	public static ModelAndView base(ModelAndView mv) {
		mv.setViewName("hello");
		return mv;
	}
}
