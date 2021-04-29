package com.clock.services;

import java.util.List;

import com.clock.entity.Is_menu;
import com.clock.entity.Layui;
import com.clock.entity.Person;
import com.clock.entity.Student;

public interface ClockService {

	Person showLogin(String name,String password);//登录系统

	List<Is_menu>SelectAll(int userId);//根据用户id 选择性登录
	
	List<Is_menu>SelectContext(int fatherId);//fatherId根据父级id查询权限
	
	
	/**
	  * 学员管理
	 * @return
	 */
	Layui<Student>SelectStudent();//查询学员信息
	int addStudent(Student stu);//增加学员
	int delStudent(int id);//删除学员
	int upStudent(Student stu);//修改学员
	List<Student>selectStudentid(int id);//修改前的查询所有数据
}
