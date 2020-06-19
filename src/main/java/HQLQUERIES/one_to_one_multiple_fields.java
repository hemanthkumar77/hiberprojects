package HQLQUERIES;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pack.HibernateUtil;

public class one_to_one_multiple_fields {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		String HQL="select e.linecse_number,e.name,a.address,a.date from owner e inner join e.info a where e.linecse_number=?";
		Query<Object[]> query=session.createQuery(HQL);
		query.setParameter(0,13245);
		List<Object[]>list=query.list();
		for(Object[] obj:list)
		{
			System.out.print("liencse_number: "+obj[0]);
			System.out.print("name: "+obj[1]);
			System.out.print("address: "+obj[2]);
			System.out.print("date: "+obj[3]);
		}
	}
}
}
