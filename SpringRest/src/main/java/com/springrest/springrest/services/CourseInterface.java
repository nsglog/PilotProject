package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseInterface {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public void addCourse(Course course);
	
	public boolean deleteCouse(long courseId);
}