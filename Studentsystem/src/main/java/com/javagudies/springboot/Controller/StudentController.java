package com.javagudies.springboot.Controller;

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

import com.javagudies.springboot.Model.Student;
import com.javagudies.springboot.Service.StudentService;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {
@Autowired
private StudentService studentService;
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	@PostMapping("/save")
public Student save(@RequestBody Student student) {
	  return studentService.insert(student);
	
	
	
	
}
	
	@GetMapping("/get")
	public List<Student> getall( Student student){
		
		List<Student>  list= studentService.getallStudents();
		return list;
	}
	@DeleteMapping("/delete/{id}")
	public String deletbyId(@PathVariable Integer id) {
		
		studentService.deletebyid(id);
		
		
		
		
		return " id is deleted";
		
		
	}
	@PutMapping("/update")
	public Student update(@PathVariable Integer id, Student student) {
		Student studentexist = studentService.getByid(id);
		 studentexist.setName(student.getName());
		 studentexist.setAdress(student.getAdress());
		 studentexist.setId(student.getId());
		
		
	return	 studentService.update( studentexist);
		
		

		
	}
	@GetMapping("/get/{id}")
	public String getByid(@PathVariable Integer id) {
		
		studentService.getByid(id);
		
		
		
		
		
		return "scuess2";
		
	}
	
		
		
		
		
		
		
	}
	
		
	

