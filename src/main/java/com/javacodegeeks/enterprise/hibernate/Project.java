package com.javacodegeeks.enterprise.hibernate;

public class Project implements java.io.Serializable{
	

	private Integer projectId;
	
	private String title;
	private String semester;
	
	private Student student;
	
	
	public Project(String title, String semester){
		this.title = title;
		this.semester = semester;
	}
	

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	private static final long serialVersionUID = 1L;

	

}
