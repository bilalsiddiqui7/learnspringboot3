package com.example.learnspringboot3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//	@RequestMapping("/Home")
//	public ModelAndView homeShow(@RequestParam("name") String clientName) {
//		//NOTE: Home.jsp will not work because we have prefix and suffix configuration in application.properties
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", clientName);
//		mv.setViewName("Home");
//		return mv;
//	}
	
	@RequestMapping("/Home")
	public ModelAndView homeShow(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employeeObject", emp);
		mv.setViewName("EmployeeHome");
		return mv;
	}
}
