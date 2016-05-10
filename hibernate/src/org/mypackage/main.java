package org.mypackage;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("hibernate framework\n");
		Configuration cfg = new Configuration();
		// populates the data of the
		System.out.print("Read configuration file\n");
		try {
            // Create the SessionFactory from hibernate.cfg.xml
			cfg.configure("org/mypackage/hibernate.cfg.xml");
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
		
		System.out.print("creating seession factory object   \n");
	    SessionFactory factory=cfg.buildSessionFactory();  
		
		System.out.print("creating session object \n");
	    Session session=factory.openSession();  
	     
	    System.out.print("creating transaction object  \n");
	    Transaction t=session.beginTransaction();
	    
	    Event ev=new Event();  
	    
	    Date date = new Date(0);
	    ev.setDate(date);
	    ev.setTitle("Thong LT");
	    
	    session.persist(ev);//persisting the object  
	      
	    t.commit();//transaction is commited 
	    
	    session.close(); 
	    System.out.println("successfully saved"); 
	    
	}

}
