package com.example.apis.courseapi.entity;

import java.util.List;

public class Course {
	private String id;
	private String name;
	private List<Instructor> instructors;

	public Course() {
	}

	public Course(String id, String name, List<Instructor> instructors) {
		super();
		this.id = id;
		this.name = name;
		this.instructors = instructors;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<Instructor> instructors) {
		this.instructors = instructors;
	}

}
