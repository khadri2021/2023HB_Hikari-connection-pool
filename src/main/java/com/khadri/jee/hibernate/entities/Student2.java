package com.khadri.jee.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Student2")
@Table(name = "STUDENT_REGISTER2")
public class Student2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUD_ID")
	private Long id;

	@Column(name = "STUD_NAME")
	private String studName;

	@Column(name = "STUD_AGE")
	private int studAge;

	@Column(name = "STUD_BRANCH")
	private String studBranch;

	@Column(name = "STUD_PHONE")
	private Long studPhone;

	@Column(name = "STUD_PARENT_PHONE")
	private Long studParentPhone;

	@Column(name = "STUD_ADDRESS")
	private String studAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public String getStudBranch() {
		return studBranch;
	}

	public void setStudBranch(String studBranch) {
		this.studBranch = studBranch;
	}

	public Long getStudPhone() {
		return studPhone;
	}

	public void setStudPhone(Long studPhone) {
		this.studPhone = studPhone;
	}

	public Long getStudParentPhone() {
		return studParentPhone;
	}

	public void setStudParentPhone(Long studParentPhone) {
		this.studParentPhone = studParentPhone;
	}

	public String getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

}
