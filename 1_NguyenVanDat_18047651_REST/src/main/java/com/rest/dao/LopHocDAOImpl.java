package com.rest.dao;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rest.entity.LopHoc;
 // TRANSACTION PHAI XAI CUA SPRING FRAME WORK :)) SAI THI 4 TR
@Repository
@Transactional

//// nho xai implemnts ,  extends thi  SAI THI 4 TR


public class LopHocDAOImpl  implements LopHocDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<LopHoc> getAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from LopHoc l ").list();
	}

	public void add(LopHoc lopHoc) {
		sessionFactory.getCurrentSession().save(lopHoc);
		
	}

	public void update(LopHoc lopHoc) {
		sessionFactory.getCurrentSession().merge(lopHoc);
		
	}

	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getbyId(id));
		
	}

	public LopHoc getbyId(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().find(LopHoc.class, id);
	}

	
	
	
}
