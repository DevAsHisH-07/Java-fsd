package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	//response -> 1. virtual response 2. physical response 
	
//	@ResponseBody
//	@RequestMapping("/sum")
//public String displaySum(HttpServletRequest request,HttpServletResponse response) {
//		
//		int res= Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
//		
//		return "the output is : "+res;
//		
//	}
//	
//	@ResponseBody
//	@RequestMapping("/sub")
//	public String displaySub(HttpServletRequest request,HttpServletResponse response) {
//		
//		int res= Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
//		
//		return "the output is : "+res;
//		
//	}
	
	//response -> 2. physical response
	
	@RequestMapping("/sum")
	public ModelAndView displaySum(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		int res= Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
		mv.setViewName("display.jsp");
		mv.addObject("result",res);
		return mv;
	}
	@RequestMapping("/sub")
	public ModelAndView displaySub(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv=new ModelAndView();
		int res= Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
		mv.setViewName("display.jsp");
		mv.addObject("result", res);
		return mv;
		
	}


}
