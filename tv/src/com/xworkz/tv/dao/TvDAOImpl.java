package com.xworkz.tv.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.tv.entity.TvEntity;

public class TvDAOImpl implements TvDAO {

	@Override
	public void saveTvEntity() {
		System.out.println("invoked saveTvEntity");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(TvEntity.class);

			configuration.configure("tvhibernate.cfg.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			session.beginTransaction();

			TvEntity tvEntity = new TvEntity("samsung", " black", 34, 50000.00, true, true);

			TvEntity tvEntity1 = new TvEntity("sony", "silver", 50, 60000.00, true, true);

			TvEntity tvEntity2 = new TvEntity("bajaj", " black", 32, 40000.00, true, false);

			TvEntity tvEntity3 = new TvEntity("oneplus", " blue", 55, 62000.00, true, true);

			TvEntity tvEntity4 = new TvEntity("toshiba", " white", 44, 35000.00, true, false);

			session.save(tvEntity);
			session.save(tvEntity1);
			session.save(tvEntity2);
			session.save(tvEntity3);
			session.save(tvEntity4);

			session.getTransaction().commit();

			System.out.println("rows inserted");

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
	public void getTvEntity() {
		System.out.println("invoked readTvEntity");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(TvEntity.class);

			configuration.configure("tvhibernate.cfg.xml");

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			TvEntity tvEntity = session.get(TvEntity.class, "samsung");

			System.out.println("read is done" + tvEntity);

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
	public void updateTvEntity() {
		System.out.println("invoked updateTvEntity ");
		SessionFactory sessionFactory = null;
		Session session = null;
		org.hibernate.Transaction transaction = null;

		try {
			Configuration configuration = new Configuration();

			configuration.configure("tvhibernate.cfg.xml");

			configuration.addAnnotatedClass(TvEntity.class);

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			TvEntity tvEntity = session.get(TvEntity.class, "samsung");

			System.out.println(" read " + tvEntity);

			tvEntity.setPrice(75000.00);

			transaction = session.beginTransaction();

			session.update(tvEntity);

			transaction.commit();

			System.out.println("after update " + tvEntity);

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
	public void deleteTvEntity() {

		System.out.println("invoked deleteTvEntity");
		SessionFactory sessionFactory = null;
		Session session = null;
		org.hibernate.Transaction transaction = null;
		try {
			Configuration configuration = new Configuration();

			configuration.configure("tvhibernate.cfg.xml");

			configuration.addAnnotatedClass(TvEntity.class);

			sessionFactory = configuration.buildSessionFactory();

			session = sessionFactory.openSession();

			TvEntity tvEntity = session.get(TvEntity.class, "bajaj");

			System.out.println(" read " + tvEntity);

			transaction = session.beginTransaction();

			session.delete(tvEntity);

			transaction.commit();

			System.out.println("deleted");

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
}
