package com.org.dao.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.entity.Course;
import com.org.service.CourseService;

public class CourseDaoImplTest {
	
	CourseService courseService;
	
	@Before
	public void setUp() {
		ApplicationContext api = new ClassPathXmlApplicationContext("spring-*.xml");
		courseService =(CourseService) api.getBean("courseService");
	}
	
	@Test
	public void testinsertCourse() {
		Course course = new Course(0,"方与圆");
		courseService.addCourse(course);
	}
}
