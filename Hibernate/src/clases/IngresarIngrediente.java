package clases;

import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
  

public class IngresarIngrediente {
	public static void main(String[] args) 
    { 
    	SessionFactory sessionFactory=SessionFactoryProvider.provideSessionFactory(); 
        Session session=sessionFactory.openSession(); 
        Transaction t=session.beginTransaction(); 
          
        Ingredientes i=new Ingredientes(4,"arroz","4", "libras"); 
        session.save(i); 
        t.commit(); 
          
        sessionFactory.close(); 
    } 

}
