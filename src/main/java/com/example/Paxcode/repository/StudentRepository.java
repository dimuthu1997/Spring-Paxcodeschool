package com.example.Paxcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Paxcode.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
