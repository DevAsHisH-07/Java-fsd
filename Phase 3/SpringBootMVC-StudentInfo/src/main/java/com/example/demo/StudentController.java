package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	Logger log=Logger.getAnonymousLogger();
	@RequestMapping("/")
	public ModelAndView defaultpage(HttpServletRequest request,HttpServletResponse response) {
		log.info("entered into the / request");
		ModelAndView mv=new ModelAndView();	
		mv.setViewName("index.jsp");	
		log.info("went to index.jsp page ");
		return mv;
		
	}
	
	@RequestMapping("/display")
	public ModelAndView display(HttpServletRequest request,HttpServletResponse response) {
		log.info("entered into the / request");
		ModelAndView mv = new ModelAndView();
		Student s = new Student();
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		
		mv.setViewName("display.jsp");
		log.info("went to display.jsp");
		mv.addObject("id",s.getId());
		mv.addObject("name",s.getName());
		mv.addObject("email",s.getEmail());
		return mv;
	}
}
