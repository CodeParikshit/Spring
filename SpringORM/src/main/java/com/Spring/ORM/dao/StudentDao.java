package com.Spring.ORM.dao;

import java.io.Serializable;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.ORM.entities.Student;

public class StudentDao {
	//as this hibernate template has the various methods such as insert a)Update.b)Insert.c)loadAll.d)get.
	//so to access those method we need to create the object of HibernateTemplate. 
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		Integer i =(Integer) this.hibernateTemplate.save(student);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
