package one_class_two_table;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {

	public static void main(String[] args) {
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
		  session.beginTransaction();
		  session.persist(new employee_sal(100,"joker","male","java_microservices",34000.234,453.23));
		  session.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
