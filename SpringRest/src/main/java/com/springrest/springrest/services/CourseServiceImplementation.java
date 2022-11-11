package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImplementation implements CourseInterface {
	
	List<Course> list;
	
	public CourseServiceImplementation() {
		
		list = new ArrayList<>();
		
		list.add(new Course(1, "java core", "this course contains basics of java"));
		list.add(new Course(2, "spring boot course", "creating rest APIS using springboot"));
		list.add(new Course(3, "api class", "learn to create an api using springboot"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		 
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		
		for(Course  c : list)	{
			
			if(c.getId() == courseId)	return c;
		}
		
		return null;
	}


	@Override
	public void addCourse(Course course) {
		list.add(course);
	}


	@Override
	public boolean deleteCouse(long courseId) {
		
		for(Course course : list)	{
			
			if(course.getId() == courseId)	{
				list.remove(course);
				return true;
			}
		}
		
		return false;
	}
}
