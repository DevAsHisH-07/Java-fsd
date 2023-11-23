package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping("/display")
	public ModelAndView display(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		Student s = new Student();
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		
		mv.setViewName("display.jsp");
		mv.addObject("id",s.getId());
		mv.addObject("name",s.getName());
		mv.addObject("email",s.getEmail());
		return mv;
	}
}
