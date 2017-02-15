package com.example.apis.courseapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.apis.courseapi.entity.Course;
import com.example.apis.courseapi.entity.Instructor;

@Service
public class CourseService {

	private List<Course> courseList = new ArrayList<>(Arrays.asList(
			new Course("CS101", "Computing Basic",
					Arrays.asList(new Instructor("Todd Matthews", "CS"), new Instructor("Martin Fowler", "EE"),
							new Instructor("Kaushik", "CS"))),
			new Course("CS102", "Digital Electronics", Arrays.asList(new Instructor("Severus Snape", "Wizardry"),
					new Instructor("Mc Gonanagle", "Witchcraft"), new Instructor("DumbleDore", "Management")))));

	public List<Course> getAllCourses() {
		return courseList;
	}

	public Course getCourse(String courseId) {
		return courseList.stream().filter(c -> c.getId().equalsIgnoreCase(courseId)).findFirst().get();
	}

	public void addCourse(Course course) {
		courseList.add(course);
	}

	public void updateCourse(Course course, String courseId) {
		int i = 0;
		for (Course c : courseList) {
			if (c.getId().equalsIgnoreCase(courseId)) {
				courseList.set(i, course);
			}
			i++;
		}
	}

	public void removeCourse(String courseId) {
		courseList.removeIf(t -> t.getId().equalsIgnoreCase(courseId));	
	}
}
