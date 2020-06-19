package singleinheritance;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
		horror object=new horror();
		object.setGamestore_id(23);
		object.setStore_name("game-stop");
		object.setCollections("evil-within");
		object.setCurrent_condition("old-one");
		object.setCustomer_details("johnson,califorina");
		object.setCost(56.45);
		session.save(object);
		session.getTransaction().commit();
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
}
