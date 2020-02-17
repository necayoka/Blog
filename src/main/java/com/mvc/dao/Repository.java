package com.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mvc.model.Blog;
import com.mvc.model.Feedback;

public class Repository {
	
	public static void saveFb(Object obj) {
		Session session = openSessionForFeedback();
		session.getTransaction().begin();
		
		session.persist(obj);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public static Feedback getFb(int id) {
		Session session = openSessionForFeedback();
		Feedback feedback = session.get(Feedback.class, id);
		session.close();
		
		return feedback;
	}
	
	public static void saveBlog(Blog blog) {
		Session session = openSessionForBlog();
		session.getTransaction().begin();
		session.persist(blog);
		session.getTransaction().commit();
		session.close();
	}
	
	public static Blog getBlog(String name) {
		Session session = openSessionForBlog();
		Blog blog = session.get(Blog.class, name);
		session.close();
		return blog;
	}
	
	public static Session openSessionForFeedback() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();	
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();	
		SessionFactory factory = metadata.buildSessionFactory();
		
		return factory.openSession();
	}	
	
	public static Session openSessionForBlog() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate2.cfg.xml").build();	
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();	
		SessionFactory factory = metadata.buildSessionFactory();
		
		return factory.openSession();
	}	
	
}
