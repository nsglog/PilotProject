package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseInterface;

@RestController
public class ControllerClass {
	
	@Autowired
	private CourseInterface courseInterface;
	
	@GetMapping("/home")
	public String home() {
		
		return "this is home page";
	}
	
	// get the courses
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		
		return this.courseInterface.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)	{
		
		return this.courseInterface.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public void addCourse(@RequestBody Course course)	{
		
		this.courseInterface.addCourse(course);  
	}
	
	@DeleteMapping("/course/{courseId}")
	public boolean deleteCourse(@PathVariable String courseId)	{
		
		boolean isDeleted = this.courseInterface.deleteCouse(Long.parseLong(courseId));
		
		return isDeleted;
	}
}
