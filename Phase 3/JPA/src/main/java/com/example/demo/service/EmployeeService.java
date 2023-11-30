package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	//creates an obj automatically wrt to the dummy object which u have created 
	@Autowired
	EmployeeRepo repo;

	//insert
	public Employee insert(Employee e) {
		return repo.save(e);
	}
	public List<Employee> getall(){
		return repo.findAll();
	}
	//insertall
	public List<Employee> insertall(List<Employee> e) {
		return repo.saveAll(e);
	}

	//getbyid
	//getbyid--primary key -int
			public Optional<Employee> getByid(int id) {
				return repo.findById(id);
			}

//	public Employee getByid(int id) {
//		return repo.findById(id).orElse(null);
//	}
	//deleteAll-deleting all records 
	public String deletebyid(int id) {
		repo.deleteById(id);
		return "deleted id of "+id;
	}
	//update                  {id:5,name:"updated name"}
		public Employee updatebyname(Employee e) {
			Employee ee=repo.findById(e.getEmpid()).orElse(null);
			ee.setEmpname(e.getEmpname());
			return repo.save(ee);
		}
		//predefined method 
		public String findphono(String name,int id) {
			return repo.findPhono(name, id);
		}



}
