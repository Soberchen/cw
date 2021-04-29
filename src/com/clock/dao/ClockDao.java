package com.clock.dao;

import java.util.List;


import com.clock.entity.Is_menu;
import com.clock.entity.Person;
import com.clock.entity.Student;

public interface ClockDao {
	/**
	 * ��¼ϵͳ
	 * @param name
	 * @param password
	 * @return
	 */
	Person showLogin(String name,String password);
	/**
	 * �����û�id ѡ���Ե�¼
	 * @param userId
	 * @return
	 */
	List<Is_menu>SelectAll(int userId);
	/**
	 * fatherId���ݸ���id��ѯȨ��
	 * @param fatherId
	 * @return
	 */
	List<Is_menu>SelectContext(int fatherId);
	
    /**
          * ��ѯѧԱ��Ϣ
     */
	List<Student>SelectStudent();
	int countStudent();
	int addStudent(Student stu);//����ѧԱ
	int delStudent(int id);//ɾ��ѧԱ
	int upStudent(Student stu);//�޸�ѧԱ
	List<Student>selectStudentid(int id);//�޸�ǰ�Ĳ�ѯ��������
}
