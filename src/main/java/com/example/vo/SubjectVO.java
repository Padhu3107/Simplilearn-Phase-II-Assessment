package com.example.vo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Subjects")
public class SubjectVO {

	@Id
	@Column(name="subject_id")
	private String subjectId;
	
	@Column(name="subject")
	private String subjectName;
	
//	@ManyToMany(mappedBy = "studSubjects")
//	private Set<StudentVO> students;
//	
//	@ManyToMany(mappedBy = "subjects")
//	private Set<TeacherVO> teachers;

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

//	public Set<StudentVO> getStudents() {
//		return students;
//	}
//
//	public void setStudents(Set<StudentVO> students) {
//		this.students = students;
//	}
//	
//	public Set<TeacherVO> getTeachers() {
//		return teachers;
//	}
//
//	public void setTeachers(Set<TeacherVO> teachers) {
//		this.teachers = teachers;
//	}

}
