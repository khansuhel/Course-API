package com.example.apis.courseapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.apis.courseapi.entity.Course;
import com.example.apis.courseapi.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@RequestMapping(value = "/courses", method = RequestMethod.GET)
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}

	@RequestMapping(value = "/courses/{id}", method=RequestMethod.GET)
	public Course getCourseById(@PathVariable("id") String courseId) {
		return courseService.getCourse(courseId);
	}

	@RequestMapping(value = "/courses", method = RequestMethod.POST)
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}

	@RequestMapping(value = "/courses/{id}", method = RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course, @PathVariable("id") String courseId) {
		courseService.updateCourse(course, courseId);
	}

	@RequestMapping(value = "/courses/{id}", method = RequestMethod.DELETE)
	public void updateCourse(@PathVariable("id") String courseId) {
		courseService.removeCourse(courseId);
	}

}
