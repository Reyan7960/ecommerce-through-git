package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Userbean;

public class FactoryProvider {
	
	
	
	
	private static SessionFactory factory;
	
	public FactoryProvider() {
		
try {
	System.out.println(factory);
			
			if (factory==null) {
				
			factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

			
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	

	
	public static SessionFactory geFactory() {

	
	try {
		System.out.println(factory);
				
				if (factory==null) {
					
				factory=  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				
				System.out.println("try block");
				System.out.println(factory);
				
				Session session = factory.openSession();
				Transaction tx = session.beginTransaction();
				Userbean ub = new Userbean();
				
				int id =(int) session.save(ub);
				tx.commit();
				System.out.println(id);
				session.close();
				

				
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		return factory;
	}
	
	
	
	
	public static void saveUser(Userbean user) {
		
	
		
		try {
			
			
			
		
	
		} catch (Exception e) {
			System.out.println("error saving user in db");
			e.printStackTrace();
		
		}
		
		
		
		
		
		
		
	}
	
	

}
