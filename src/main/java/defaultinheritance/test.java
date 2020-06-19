package defaultinheritance;


import java.util.Date;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
		reciever object=new reciever();
		object.setId(300);
		object.setBranch_name("new-york");
		object.setSender("jigsaw");
		object.setReciver_info("joker,asyulum hospital,new jersey");
		object.setDate(new Date());
		object.setCost(34.45);
		session.save(object);
		session.getTransaction().commit();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
