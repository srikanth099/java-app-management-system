package com.friday.app_management.daoRepository;

import org.ass.core.entity.UserEntity;
import org.ass.core.util.ConnectionPropertiesUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.friday.app_management.entity.AppDetails;
import com.friday.app_management.util.AppConnection;

public class AppRepository {

	public void save(AppDetails appDetails) {
		Configuration configuration = new Configuration();
		configuration.setProperties(AppConnection.TakeDbProperties());
		configuration.addAnnotatedClass(AppDetails.class);// metadata extra peace of information
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(appDetails);
		transaction.commit();
	}

	public void update() {

	}

	public void delete() {

	}

	public AppDetails findById(long id) {
		Configuration configuration = new Configuration();
		configuration.setProperties(AppConnection.TakeDbProperties());
		configuration.addAnnotatedClass(AppDetails.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		AppDetails appDetails = session.get(AppDetails.class, id);
		return appDetails;
	}
}
