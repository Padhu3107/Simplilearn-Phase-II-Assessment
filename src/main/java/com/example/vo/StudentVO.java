package com.example.vo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class StudentVO {

	@Id
	@Column(name="roll_no")
	private String studentId;
	
	@Column(name="name")
	private String studentName;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(
//		name="Student_Class_Rltnshp",
//		joinColumns = @JoinColumn(name="roll_no"),
//		inverseJoinColumns = @JoinColumn(name="subject_id"))
//	@MapKeyJoinColumn(name = "class_id")
//	private Map<ClassVO,SubjectVO> studSubjects = new HashMap<>();
//
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinTable(
//		name="Student_Class_Rltnshp",
//		inverseJoinColumns = @JoinColumn(name="class_id"))
//	private ClassVO studClassId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

//	public Map<ClassVO,SubjectVO> getSubjects() {
//		return studSubjects;
//	}
//
//	public void setSubjects(Map<ClassVO,SubjectVO> subjects) {
//		this.studSubjects = subjects;
//	}
//
//	public ClassVO getClassId() {
//		return studClassId;
//	}
//
//	public void setClassId(ClassVO classId) {
//		this.studClassId = classId;
//	}
}
