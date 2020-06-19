package HQLQUERIES;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.SimpleSubqueryExpression;

import com.pack.HibernateUtil;

public class update {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		int ID=103;
		String Name="vitiamns";
		String HQl="update pharamacy_shop  set  name=:Name where id=:ID";
		Query query=session.createQuery(HQl);
		query.setParameter("ID",ID);
		query.setParameter("Name", Name);
		session.beginTransaction();
		int value=query.executeUpdate();
		if(value>0)
		{
			System.out.print("value updated successfully");
		}
		session.getTransaction().commit();
	}
}
}
