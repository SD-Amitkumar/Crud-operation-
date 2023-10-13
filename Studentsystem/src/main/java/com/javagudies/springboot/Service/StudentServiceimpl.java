package com.javagudies.springboot.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javagudies.springboot.Model.Student;
import com.javagudies.springboot.repository.StudentRepository;

@Service
public class StudentServiceimpl implements StudentService {

	public StudentServiceimpl() {
		// TODO Auto-generated constructor stub
	}
@Autowired
private StudentRepository studentRepo;
	@Override
	public Student insert(Student student) {
		 return studentRepo.save(student);
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Student> getallStudents() {
		 return studentRepo.findAll();
		
	}



	@Override
	
	public Student update(Student student) {
		// TODO Auto-generated method stub
		
	return	studentRepo.save(student);
		
	}

	@Override
	public Student getByid(Integer id) {
	    return   studentRepo.getById(id);
	
	}

	@Override
	public Student deletebyid(int id) {
	
		return deletebyid(id);
	}



	

		
		
	}



	

	


