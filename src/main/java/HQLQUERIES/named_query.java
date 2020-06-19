package HQLQUERIES;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.pack.HibernateUtil;
 
public class named_query {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		Query<Object[]>query=session.getNamedQuery("get");
		List<Object[]>list=query.list();
		for(Object[] obj:list)
		{
			System.out.print("id: "+obj[0] );
			System.out.print("name: "+obj[1]);
			System.out.print("date: "+obj[2]);
			System.out.print("\n");
		}
	}
}
}
