package com.altimetrik.service;

import java.util.List;

import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.hibernate.cfg.AnnotationConfiguration;

import com.altimetrik.model.vehicalDetails;

public class SearchImpl implements Search {
	
	@Autowired
	private vehicalDetails details;

	public List<?> getVechicalDetails(String type,String manufacture, String model) {
		// TODO Auto-generated method stub
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(vehicalDetails.class);
		SessionFactory factory = config.configure().buildSessionFactory();
		org.hibernate.Session session = factory.getCurrentSession();
		session.beginTransaction();
		String hql = "FROM vehicaldetails where type="+type+",manufacture="+manufacture+",model="+model;
		org.hibernate.query.Query query = session.createQuery(hql);
		List results = query.list();
		return results;
	}

}
