package ca.sheridancollege.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import ca.sheridancollege.beans.Product;

public class DAO {

	SessionFactory sessionFactory = new Configuration()
			.configure("ca/sheridancollege/config/hibernate.cfg.xml")
			.buildSessionFactory();

	public ArrayList<Product> initializeSubjects() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query= session.createQuery("from Product");
		
		ArrayList<Product> products = (ArrayList<Product>) query.getResultList();
		
		if(products.size()==0){
									
			products.add(new Product("991338337","Excel",2.0,"True Happiness right out of the box. Enjoy the rich, flaky, melt in your mouth taste of RITZ in a variety of delicious flavours.",500,1,"200g","Excel","453434234","30",""));
			
			session.save(products.get(0));
			
			
			session.getTransaction().commit();
			session.close();
			
			return products;
		}
		else{
			return products;
		}
	}
	
	public ArrayList<Product> getProduct(String productId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query= session.createQuery("from Product where productId=:productId");
		query.setParameter("productId", productId);
		
		ArrayList<Product> products = (ArrayList<Product>) query.getResultList();
		
		return products;
		
	}
		
	}


