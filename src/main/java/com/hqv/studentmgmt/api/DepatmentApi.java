package com.hqv.studentmgmt.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.studentmgmt.entity.Department;
import com.hqv.studentmgmt.repository.DepartmentRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class DepatmentApi {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@PostMapping("/department")
	public Department saveDepartment(
			@RequestBody Department department)
	{
		departmentRepository.save(department);
		return department;
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartment(
			@RequestBody Department department, @PathVariable("id") long id)
	{
		department.setId(id);
		departmentRepository.save(department);
		return department;
	}
	
	@GetMapping("/department")
	public List<Department> getAllDept(){
		return departmentRepository.findAll();
	}
	
	@GetMapping("/department/{id}")
	public Department getDeptById(@PathVariable("id") long id){
		return departmentRepository.findOneById(id);
	}
	
	@DeleteMapping("/department/{id}")
	public Boolean deleteDepartment(@PathVariable("id") long id) {
		departmentRepository.deleteById(id);
		return true;
	}
	
	
}
