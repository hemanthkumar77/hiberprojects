package two_class_one_table;

import java.util.Date;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
		session.save(new student(12,"joker",29,new Date(),new address("420 atalntic","Connecticut","bridgeport",06604)));
		session.getTransaction().commit();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
