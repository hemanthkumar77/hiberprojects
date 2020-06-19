package HQLQUERIES;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pack.HibernateUtil;

import jointable.tenants;

public class multipilefileds {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		String Hql="select client_name,door_number,lease_amount,date from tenants";
		Query<Object[]>query=session.createQuery(Hql);
		List<Object[]>obj=query.list();
		for(Object[] ob:obj)
		{
			System.out.print("client_name: "+ob[0]);
			System.out.print("door_number: "+ob[1]);
			System.out.print("lease_amount: "+ob[2]);
			System.out.print("date: "+ob[3]);
		}
	}
}
}
