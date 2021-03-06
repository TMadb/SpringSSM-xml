package com.org.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import com.org.dao.CourseDao;
import com.org.entity.Course;
import com.org.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Resource
	CourseDao courseDao;
	
	
	//设值注入使用，在主配置文件中配置
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public void addCourse(Course course) {
		courseDao.insertCourse(course);			
	}
}
