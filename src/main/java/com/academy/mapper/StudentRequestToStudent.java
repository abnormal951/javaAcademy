package com.academy.mapper;

import org.springframework.stereotype.Component;

import com.academy.dto.StudentRequest;
import com.academy.entities.Student;

@Component
public class StudentRequestToStudent implements IMapper<StudentRequest, Student>{

	@Override
	public Student map(StudentRequest in) {
		Student student = new Student();
		student.setLastName(in.getLastName());
		student.setFirstName(in.getFirstName());
		student.setBirth_Date(in.getBirth_Date());
		student.setGender(in.getGender());
		return student;
	}

}
