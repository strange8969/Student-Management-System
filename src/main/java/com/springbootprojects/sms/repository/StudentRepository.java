package com.springbootprojects.sms.repository;

import com.springbootprojects.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
