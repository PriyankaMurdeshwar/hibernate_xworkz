package com.xworkz.mobile.dao;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.xworkz.mobile.entity.MobileEntity;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public void saveMobileEntity() {

		System.out.println("invoked saveMobileEntity");
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;

		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(MobileEntity.class);

			configuration.configure("hibernate.cfg.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			session.beginTransaction();

			MobileEntity mobileEntity = new MobileEntity(3, "apple", 50000.00, "25gb", "white", 47, true, "mac");

			session.save(mobileEntity);

			session.getTransaction().commit();

		} catch (HibernateException e) {
			System.out.println("inside catch block !!!");

		} finally {

			if (session != null) {

				session.close();
				System.out.println(" session is closed");

			} else {

				System.out.println("session is not closed");

			}
			if (sessionFactory != null) {

				sessionFactory.close();
				System.out.println(" sessionFactory is closed");
			} else {

				System.out.println("sessionFactory is not closed");

			}
		}
	}

	@Override
	public void readMobileEntity() {
		System.out.println("invoked readMobileEntity");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(MobileEntity.class);

			configuration.configure("hibernate.cfg.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 2);

			System.out.println("read is done" + mobileEntity);

		} catch (HibernateException e) {

			System.out.println("inside catch block!!!");

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}
			if (sessionFactory != null) {
				System.out.println("sessionFactory is closed");
			} else {
				System.out.println("sessionFactory is not closed");
			}
		}
	}

	@Override
	public void updateMobileEntity() {
		System.out.println("invoked updateMobileEntity ");
		SessionFactory sessionFactory = null;
		Session session = null;
		org.hibernate.Transaction transaction = null;
		try {
			Configuration configuration = new Configuration();

			configuration.configure("hibernate.cfg.xml");

			configuration.addAnnotatedClass(MobileEntity.class);

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 1);

			System.out.println(" read " + mobileEntity);

			mobileEntity.setOsType("android");

			transaction = session.beginTransaction();
			session.update(mobileEntity);

			transaction.commit();

			System.out.println("after update " + mobileEntity);

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}
			if (sessionFactory != null) {
				System.out.println("sessionFactory is closed");
			} else {
				System.out.println("sessionFactory is not closed");
			}
		}

	}

	@Override
	public void deleteMobileEntity() {
		System.out.println("invoked deleteMobileEntity");
		SessionFactory sessionFactory = null;
		Session session = null;
		org.hibernate.Transaction transaction = null;
		try {
			Configuration configuration = new Configuration();

			configuration.configure("hibernate.cfg.xml");

			configuration.addAnnotatedClass(MobileEntity.class);

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			MobileEntity mobileEntity = session.get(MobileEntity.class, 3);

			System.out.println(" read " + mobileEntity);

			transaction = session.beginTransaction();

			session.delete(mobileEntity);

			transaction.commit();

			System.out.println("deleted");

		} catch (HibernateException e) {

		} finally {

			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}
			if (sessionFactory != null) {
				System.out.println("sessionFactory is closed");
			} else {
				System.out.println("sessionFactory is not closed");
			}
		}

	}

}
