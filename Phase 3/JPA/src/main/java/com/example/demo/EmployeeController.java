package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	//for rest
	@PostMapping("/insert")
	//insert
	public Employee insert(@RequestBody Employee e) {
		return service.insert(e);
	}

	@PostMapping("/insertall")
	public List<Employee> insertall(@RequestBody List<Employee> e) {
		return service.insertall(e);
	}
	@GetMapping("/getall")
	public List<Employee> getall(){
		return service.getall();
	}

				//pathvariables
	@GetMapping("/getbyid/{id}")
	public Optional<Employee> getByid(@PathVariable("id") int id) throws ResourceRequestNotFoundException {
		if(service.getByid(id).isEmpty()) {
			throw new ResourceRequestNotFoundException("id not found");
		}
		else {
			return service.getByid(id);
		}
	}


	
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable("id") int id) {
		service.deletebyid(id);
		return "deleted record with id "+id;
		}
	@DeleteMapping("/deletegetall/{id}")
	public List<Employee> deletegetall(@PathVariable("id") int id) {
		service.deletebyid(id);
		return service.getall();
		}
	@PutMapping("/update")
	public Employee updatebyname(@RequestBody Employee e) {
		return service.updatebyname(e);
	}
	@GetMapping("/getphno/{name}/{id}")
	public String findphono(@PathVariable("name") String name,@PathVariable("id") int id) {
		return service.findphono(name, id);
	}




	//	@RequestMapping("/")
	//	//alternate of request.getParameter=>@RequestParam("name") String name 
	//	public ModelAndView defaultPage(HttpServletRequest request,HttpServletResponse response) {
	//		ModelAndView mv=new ModelAndView();
	//
	//		mv.setViewName("index.jsp");
	//
	//		return mv;
	//	}


	//	@RequestMapping("/insert")
	//	//alternate of request.getParameter=>@RequestParam("name") String name 
	//	public ModelAndView insertrecord(HttpServletRequest request,HttpServletResponse response) {
	//		ModelAndView mv=new ModelAndView();
	//		Employee e=new Employee();
	//		e.setEmpname(request.getParameter("name"));
	//		e.setPhono(request.getParameter("phono"));
	//		if(service.insert(e)!=null) {
	//			mv.setViewName("display.jsp");
	//		}
	//
	//		return mv;
	//	}


	//	@RequestMapping("/getall")
	//	//alternate of request.getParameter=>@RequestParam("name") String name 
	//	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
	//		ModelAndView mv=new ModelAndView();
	//		List<Employee> list=service.getall();
	//		mv.setViewName("displayall.jsp");
	//		mv.addObject("list",list);
	//
	//		return mv;
	//	}

}

