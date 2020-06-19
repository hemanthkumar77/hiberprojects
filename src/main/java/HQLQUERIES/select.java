package HQLQUERIES;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.pack.HibernateUtil;

import onetomany.Department;

public class select {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
	String Hql="from  Department";
	Query<Department>query=session.createQuery(Hql,Department.class);
	List<Department>object=query.list();
	for(Department obj:object)
	{
		System.out.print("ID: "+obj.getId());
		System.out.print("Name: "+obj.getName());
		System.out.print("Total: "+obj.getStrength());
		System.out.print("\n");
	}
	}
}
}
