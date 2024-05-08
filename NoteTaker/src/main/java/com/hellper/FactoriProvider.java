package com.hellper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoriProvider {

	public static SessionFactory factory;
	
	public static SessionFactory getfactory()
	{
		if(factory==null)
		{
			factory= new Configuration().configure("persistence.xml").buildSessionFactory();
		}
		
		return factory;
	}
	
	public void closeFactory()
	{
		if(factory.isOpen())
		{
			factory.close();
		}
	}
	
}
