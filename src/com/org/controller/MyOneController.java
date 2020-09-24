package com.org.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.org.dao.CourseDao;
import com.org.entity.Course;
import com.org.service.CourseService;


public class MyOneController implements Controller {

//	CourseDao courseDao;
//	
//	
//	public void setCourseDao(CourseDao courseDao) {
//		this.courseDao = courseDao;
//	}
	
	CourseService courseService;
	

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		int cid = Integer.parseInt(request.getParameter("cid"));
		String cname = request.getParameter("cname");
		Course course = new Course(cid,cname);
		//执行插入数据操作
//		courseDao.insertCourse(course);
		courseService.addCourse(course);
		//采用setViewName实现请求转发
		mv.setViewName("/index.jsp");
		return mv;
	}
 
}
