package HibernateAnnotation.AnnotationHib;
import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import HibernateAnnotation.AnnotationHib.Employee;
public class StoreData {

	private static final String Query = null;
	 

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  
	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	          
	   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();   
	            
	   /* Employee e1=new Employee();    
	    e1.setId(103);    
	    e1.setFirstName("Santhoshi");    
	    e1.setLastName("Rupa");   */
	/*String hql="FROM Employee";
	String hql="FROM Employee as E where E.id>=110";*/
	/*String hql="SELECT E.firstName from Employee E where E.firstName=santhoshi";
	Query query=session.createQuery(hql);*/
	String hql = "FROM Employee";
	Query query = session.createQuery(hql);
	List rt = query.list();
	System.out.println(rt);
	 
	        
	   /* session.save(e1);  
	    t.commit();  
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    */
	        
	}

	 
	 
		 

	}


