package com.springbootprojects.sms;

import com.springbootprojects.sms.entity.Student;
import com.springbootprojects.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student = new Student("Aaditya", "Raj","aaditya@gmail.com");
//		studentRepository.save(student);

//		Student student1 = new Student("Amit", "Gunjan Jha","amit@gmail.com");
//		studentRepository.save(student1);

//		Student student2 = new Student("Shubham", "Singh","shubham@gmail.com");
//		studentRepository.save(student2);
	}
}
