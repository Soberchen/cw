package com.clock.services;

import java.util.List;

import com.clock.entity.Is_menu;
import com.clock.entity.Layui;
import com.clock.entity.Person;
import com.clock.entity.Student;

public interface ClockService {

	Person showLogin(String name,String password);//��¼ϵͳ

	List<Is_menu>SelectAll(int userId);//�����û�id ѡ���Ե�¼
	
	List<Is_menu>SelectContext(int fatherId);//fatherId���ݸ���id��ѯȨ��
	
	
	/**
	  * ѧԱ����
	 * @return
	 */
	Layui<Student>SelectStudent();//��ѯѧԱ��Ϣ
	int addStudent(Student stu);//����ѧԱ
	int delStudent(int id);//ɾ��ѧԱ
	int upStudent(Student stu);//�޸�ѧԱ
	List<Student>selectStudentid(int id);//�޸�ǰ�Ĳ�ѯ��������
}
