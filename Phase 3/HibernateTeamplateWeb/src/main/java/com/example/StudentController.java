package com.example;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student s=ac.getBean(Student.class);
		StudentDAO dao=ac.getBean(StudentDAO.class);
		s.setSname(request.getParameter("name"));
		s.setSemail(request.getParameter("email"));
		if(dao.insert(s)>0) {
			mv.setViewName("success.jsp");
		}
		
		
		return mv;
	}
	
	
	@RequestMapping("/getall")
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student student=ac.getBean(Student.class);
		StudentDAO dao=ac.getBean(StudentDAO.class);
		List<Student> list=dao.getal();
		mv.setViewName("displayall.jsp");
		mv.addObject("list",list);
		
		return mv;
	}
	
}
