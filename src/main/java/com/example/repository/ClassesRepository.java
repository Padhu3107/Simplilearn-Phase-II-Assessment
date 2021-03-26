package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vo.ClassVO;

public interface ClassesRepository extends JpaRepository<ClassVO, Long>{

	ClassVO findByClassId(String classId);
	int deleteByClassId(String classId);
}
