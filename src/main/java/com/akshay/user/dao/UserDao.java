package com.akshay.user.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.akshay.user.model.User;

@Transactional
@Repository("userDao")
public class UserDao implements IUser{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(user);
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(user);
	}

	public User findUserByEmailId(String id) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("from User where email_id = :id").setParameter("id", id);
		//query.setString("intervalPeriod", intervalPeriod);
		return (User)query.list().get(0);		
	}

}
