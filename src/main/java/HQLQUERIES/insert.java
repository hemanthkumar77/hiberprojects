package HQLQUERIES;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pack.HibernateUtil;

public class insert {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		String Hql="insert into pharamacy_shop(id,name,date,price)"+"select id,name,date,price from pharamcy";
		Query query=session.createQuery(Hql);
		session.beginTransaction();
		int varaible=query.executeUpdate();
		if(varaible>0)
		{
			System.out.print("values updated");
		}
	}
}
}
