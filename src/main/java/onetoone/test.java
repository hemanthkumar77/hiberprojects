package onetoone;

import java.util.Date;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
		session.save(new license_info("mrytle","new-york",new Date(),"twoWheller,Fourwheller",new owner(100,"batman",21)));
		session.getTransaction().commit();
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
}
