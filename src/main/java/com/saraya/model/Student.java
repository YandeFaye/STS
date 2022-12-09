package com.saraya.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	private  int id;
	private String firstname;
	private String lastname;
	private LocalDate dateOfBirth;
	private String trainingDuration;
	private LocalDate registrationDate;
	private String studentImage;
	private String description;
	
	public Student(int id,String firstname, String lastname, LocalDate dateOfBirth, String trainingDuration, LocalDate registrationDate,
			String studentImage,String description) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.trainingDuration = trainingDuration;
		this.registrationDate = registrationDate;
		this.studentImage = studentImage;
		this.description = description;
	}
	
	public Student() {
		super();
	}

	public Student(String firstname) {
		super();
		this.firstname = firstname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getStudentImage() {
		return studentImage;
	}

	public void setStudentImage(String studentImage) {
		this.studentImage = studentImage;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getTrainingDuration() {
		return trainingDuration;
	}
	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dateOfBirth="
				+ dateOfBirth + ", trainingDuration=" + trainingDuration + ", registrationDate=" + registrationDate
				+ ", studentImage=" + studentImage + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}

	

	

	
	

	
}
