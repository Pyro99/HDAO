package com.niit.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.dao.UserDAO;
import com.niit.model.User;

public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addUser(User user) {
		Transaction tx=null;
		try {
		Session session=sessionFactory.getCurrentSession();
		tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		return true;
		}
		catch(Exception e)
		{
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean deleteUser(User user) {
		Transaction tx=null;
		try {
		Session session=sessionFactory.getCurrentSession();
		tx=session.beginTransaction();
		session.delete(user);
		tx.commit();
		return true;
		}
		catch(Exception e)
		{
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
		Transaction tx=null;
		try {
		Session session=sessionFactory.getCurrentSession();
		tx=session.beginTransaction();
		session.saveOrUpdate(user);
		tx.commit();
		return true;
		}
		catch(Exception e)
		{
			tx.rollback();
			return false;
		}
	}

	@Override
	public List<User> displayUsers(User user) {
		return sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}

	@Override
	public User displayUser(int userid) {
		Session session= sessionFactory.getCurrentSession();
		Query query=session.createQuery("from com.niit.model.User where userid= :id");
		return (User)query.setParameter("uid", userid).getResultList().get(0);
	}


}
