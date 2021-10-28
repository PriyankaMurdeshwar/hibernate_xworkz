package com.xworkz.mobile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.mobile.entity.MobileEntity;

public class MobileTester {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		
		configuration.addAnnotatedClass(MobileEntity.class);
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		MobileEntity mobileEntity = new MobileEntity(1, "oppo", 45000.00, "4", "blue", 17, true, "windows-10");
		session.save(mobileEntity);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
