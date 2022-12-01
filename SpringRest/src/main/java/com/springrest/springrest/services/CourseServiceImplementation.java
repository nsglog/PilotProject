package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImplementation implements CourseInterface {
	
	@Autowired
	private CourseDao cd;
	
	
	@Override
	public List<Course> getCourses() {
		return cd.findAll();
	}


	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		return cd.getById(courseId);
	}


	@Override
	public void addCourse(Course course) {
		cd.save(course);
	}
	
	@Override
	public void updateCourse(Course course)	{
		cd.save(course);
	}


	@SuppressWarnings("deprecation")
	@Override
	public void deleteCourse(long courseId) {
		
		Course entity = cd.getOne(courseId);
		cd.delete(entity);
	}
}
