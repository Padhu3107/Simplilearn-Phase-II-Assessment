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
@Table(name="Teachers")
public class TeacherVO {

	@Id
	@Column(name="emp_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String staffId;
	
	@Column(name="name")
	private String staffName;

//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(
//			name="teacher_class_rltnshp",
//			joinColumns = @JoinColumn(name="emp_id"),
//			inverseJoinColumns = @JoinColumn(name="subject_id"))
//	@MapKeyJoinColumn(name = "class_id")
//	private Map<ClassVO,SubjectVO> subjects = new HashMap<>();
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinTable(
//			name="teacher_class_rltnshp",
//			inverseJoinColumns = @JoinColumn(name="class_id"))
//	private ClassVO classId;
	
	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

//	public Map<ClassVO,SubjectVO> getSubjects() {
//		return subjects;
//	}
//
//	public void setSubjects(Map<ClassVO,SubjectVO> subjects) {
//		this.subjects = subjects;
//	}
//
//	public ClassVO getClassId() {
//		return classId;
//	}
//
//	public void setClassId(ClassVO classId) {
//		this.classId = classId;
//	}

}
