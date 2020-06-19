package table_per_classes;

import java.util.Date;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
		two_wheeler object=new two_wheeler();
		object.setId(102);
		object.setShow_room_name("dealers");
		object.setBranch("jersey");
		object.setCompany_name("honda");
		object.setDate(new Date());
		object.setCc(900);
		object.setModel("cbr");
		object.setCost(45678.45);
		session.save(object);
		session.getTransaction().commit();
	}
}
}
