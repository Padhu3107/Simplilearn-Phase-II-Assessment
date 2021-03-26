package com.example.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Classes")
public class ClassVO {

	@Id
	@Column(name="class_id")
	private String classId;
	
	@Column(name="class_desc")
	private String classDesc;
	
//	@OneToOne(mappedBy = "studClassId")
//	private StudentVO student;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassDesc() {
		return classDesc;
	}

	public void setClassDesc(String classDesc) {
		this.classDesc = classDesc;
	}

//	public StudentVO getStudent() {
//		return student;
//	}
//
//	public void setStudent(StudentVO student) {
//		this.student = student;
//	}

}
