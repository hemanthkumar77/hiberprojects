package HQLQUERIES;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pack.HibernateUtil;

import onetomany.Department;

public class placeholder {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		String Hql="from Department where id=?";
		Query<Department>query=session.createQuery(Hql,Department.class);
		 query.setParameter(0,3);
		Department object=query.uniqueResult();
		System.out.print("name: "+object.getName());
		System.out.print("total_strength: "+object.getStrength());
		 
	}
}
}
