package jointable;

import java.util.Date;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {
	
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
	tenants object=new tenants();
	object.setLease_id(1324);
	object.setLocation("new-york");
	object.setYears(5);
	object.setLease_amount(50000.23);
	object.setHouse_name("atlanta");
	object.setDoor_number("360-A");
	object.setDate(new Date());
	object.setClient_name("walker");
	session.save(object);
	session.getTransaction().commit();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
