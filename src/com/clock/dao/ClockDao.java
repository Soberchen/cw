package com.clock.dao;

import java.util.List;


import com.clock.entity.Is_menu;
import com.clock.entity.Person;
import com.clock.entity.Student;

public interface ClockDao {
	/**
	 * 登录系统
	 * @param name
	 * @param password
	 * @return
	 */
	Person showLogin(String name,String password);
	/**
	 * 根据用户id 选择性登录
	 * @param userId
	 * @return
	 */
	List<Is_menu>SelectAll(int userId);
	/**
	 * fatherId根据父级id查询权限
	 * @param fatherId
	 * @return
	 */
	List<Is_menu>SelectContext(int fatherId);
	
    /**
          * 查询学员信息
     */
	List<Student>SelectStudent();
	int countStudent();
	int addStudent(Student stu);//增加学员
	int delStudent(int id);//删除学员
	int upStudent(Student stu);//修改学员
	List<Student>selectStudentid(int id);//修改前的查询所有数据
}
