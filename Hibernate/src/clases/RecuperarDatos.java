package clases;


import org.hibernate.Session; 
import org.hibernate.SessionFactory; 

public class RecuperarDatos {
	public static void main(String[] args) 
    { 
        SessionFactory sessionFactory=SessionFactoryProvider.provideSessionFactory(); 
        Session session=sessionFactory.openSession(); 
          
        Ingredientes i=session.get(Ingredientes.class, 1); 
        System.out.println("Id : "+i.getIdIngrediente()); 
        System.out.println("Name : "+i.getNombreIngrediente()); 
        System.out.println("Cantidad : "+i.getCantidad()); 
        System.out.println("Unidad de medida : "+i.getUnidadDeMedida()); 
          
        sessionFactory.close(); 
    } 

}
