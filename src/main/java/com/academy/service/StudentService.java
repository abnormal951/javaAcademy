package com.academy.service;

import org.springframework.stereotype.Service;

import com.academy.dto.StudentFullNameDTO;
import com.academy.dto.StudentRequest;
import com.academy.entities.Student;
import com.academy.mapper.StudentRequestToStudent;
import com.academy.repository.StudentRepository;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	private final StudentRequestToStudent mapper;
	
	public StudentService(StudentRepository studentRepository,StudentRequestToStudent mapper) {
		
		this.studentRepository = studentRepository;
		this.mapper=mapper;
	}
	
	public Student createStudent(StudentRequest studentRequest) {
		Student student = mapper.map(studentRequest);
		return this.studentRepository.save(student);
		
	}
	
	public StudentFullNameDTO getStudentById(Long id) {
		
		
		StudentFullNameDTO studentFullNameDTO = null;
	    Student student = studentRepository.getById(id);
	
		if(student != null) {
			
			studentFullNameDTO = new StudentFullNameDTO();
			studentFullNameDTO.setFirstName(student.getFirstName());
			studentFullNameDTO.setLastName(student.getLastName());
			studentFullNameDTO.setBirth_Date(student.getBirth_Date());
			studentFullNameDTO.setGender(student.getGender());
			studentFullNameDTO.setFullName(student.getFirstName() + " " + student.getLastName());
					
			
		}
	
		return studentFullNameDTO;
		
	}
	
}
