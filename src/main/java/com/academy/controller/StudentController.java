package com.academy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.dto.StudentFullNameDTO;
import com.academy.dto.StudentRequest;
import com.academy.entities.Student;
import com.academy.service.StudentService;

@RestController
@RequestMapping("/academy")
public class StudentController {

	private final StudentService studentService;
	
	public StudentController (StudentService studentService) {
		this.studentService=studentService;
	}
	
	@PostMapping("/student")
	public Student creteStudent(@RequestBody StudentRequest studentRequest) {
		return this.studentService.createStudent(studentRequest);
		
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<StudentFullNameDTO> obtenerStudent(@PathVariable("id") Long id){
		StudentFullNameDTO studentFullNameDTO = studentService.getStudentById(id);		 
		if(studentFullNameDTO == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(studentFullNameDTO);
	}
	
}
