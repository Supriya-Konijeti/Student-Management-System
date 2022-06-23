package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repo.StudentRepo;

@SpringBootApplication
public class StudentManagementSystem23062022Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem23062022Application.class, args);
		}

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1= new Student("Supriya1","Konijeti1","supriya@gmail.com");
		studentRepo.save(student1);
		
		Student student2= new Student("Umme1","Athiya1","umme.gmail@com");
		studentRepo.save(student2);
		
		
	}

}
