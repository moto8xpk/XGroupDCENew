package webappgroup.webappatifact;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloWorld")
	public ModelAndView getHelloWorld() {
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("Welcome");
	modelAndView.addObject("message","Hello World");
	modelAndView.addObject("message1","Hello World2");
	
		
	return modelAndView;
	}
	
}
