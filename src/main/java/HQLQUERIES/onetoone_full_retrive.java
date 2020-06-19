package HQLQUERIES;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pack.HibernateUtil;

import onetoone.license_info;
import onetoone.owner;

public class onetoone_full_retrive {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		String Hql="from owner ow inner join Fetch ow.info where ow.linecse_number=:ID";
		Query<owner> query=session.createQuery(Hql,owner.class);
		query.setParameter("ID",100);
		owner object= query.uniqueResult();
		System.out.print("linecse_number: "+object.getLinecse_number());
		System.out.print("name :"+object.getName());
		System.out.print("age: "+object.getAge());
		license_info obj=object.getInfo();
	    System.out.print("registeration_date: "+obj.getDate());
	    System.out.print("address_: "+obj.getAddress());
        System.out.print("vachile_type: "+obj.getVechile_type());	
	   
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
