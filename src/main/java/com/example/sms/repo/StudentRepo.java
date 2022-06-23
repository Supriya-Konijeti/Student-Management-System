package com.example.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entity.*;

public interface StudentRepo extends JpaRepository<Student, Long>{

	
	
}
