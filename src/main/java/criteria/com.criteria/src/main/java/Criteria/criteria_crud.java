package Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.employee;
import entity.employeedto;

public class criteria_crud {

	public void select_all()
	{
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery cq=builder.createQuery();
		Root<employee>root=cq.from(employee.class);
		cq.select(root);
	    Query<employee>data=session.createQuery(cq);
	    List<employee>obj=data.getResultList();
	     for(employee val:obj)
	     {
	    	 System.out.println(val);
	     }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
public static void main(String args[])
{
	//new criteria_crud().select_all();
	//new criteria_crud().update();
	//new criteria_crud().multiple_fields();
	//new criteria_crud().DTO_call();
	//new criteria_crud().group();
	new criteria_crud().predicate();
}

public void where()
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
	  CriteriaBuilder builder=session.getCriteriaBuilder();
	  CriteriaQuery cq=builder.createQuery();
	  Root<employee>root=cq.from(employee.class);
	  cq.select(root);
	  cq.where(builder.equal(root.get("dept_name"),"C#"));
	  Query<employee>obj=session.createQuery(cq);
	  employee emp=obj.getSingleResult();
	  System.out.print(emp);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void update()
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
	  session.beginTransaction();
	  CriteriaBuilder builder=session.getCriteriaBuilder();
	  CriteriaUpdate cup=builder.createCriteriaUpdate(employee.class);
	  Root<employee>root=cup.from(employee.class);
	  cup.set("salary",5400.45);
	  cup.where(builder.equal(root.get("emp_id"),101));
	  session.createQuery(cup).executeUpdate();
	  session.getTransaction().commit();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void delete()
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
	  session.beginTransaction();
	  CriteriaBuilder builder=session.getCriteriaBuilder();
	  CriteriaDelete<employee> del=builder.createCriteriaDelete(employee.class);
	  Root<employee>root=del.from(employee.class);
	  del.where(builder.equal(root.get("emp_id"),103));
	  session.createQuery(del).executeUpdate();
	  session.getTransaction().commit();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void multiple_fields()
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
	 CriteriaBuilder builder=session.getCriteriaBuilder();
	 CriteriaQuery cq=builder.createQuery();
	 Root<employee>root=cq.from(employee.class);
	 cq.multiselect(root.get("emp_id"),root.get("emp_name"));
	 cq.where(builder.greaterThanOrEqualTo(root.get("salary"),4000));
	 Query<Object[]>obj=session.createQuery(cq);
	 List<Object[]>list=obj.getResultList();
	 for(Object [] ob:list)
	 {
		 System.out.print("employee_name: "+ob[0]);
		 System.out.print("employee_name: "+ob[1]); 
	 }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public void DTO_call()
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
	 CriteriaBuilder builder=session.getCriteriaBuilder();
	 CriteriaQuery cq=builder.createQuery();
	 Root<employee>root=cq.from(employee.class);
	 Expression<Double>max_sal=builder.max(root.get("salary"));
	 Expression<Double>min_sal=builder.min(root.get("salary"));
	 Expression<Double>avg_sal=builder.avg(root.get("salary"));
	 Expression<Long>no_of_employees=builder.count(root);
	 cq.select(builder.construct(employeedto.class,max_sal,min_sal,avg_sal,no_of_employees));
	 Query<employeedto>obj=session.createQuery(cq);
	 employeedto val=obj.getSingleResult();
	 System.out.print(val);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public void group()
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
	 CriteriaBuilder builder=session.getCriteriaBuilder();
	 CriteriaQuery cq=builder.createQuery();
	 Root<employee>root=cq.from(employee.class);
	 cq.multiselect(root.get("emp_id"),root.get("emp_name"),root.get("salary"));
	 cq.groupBy(root.get("dept_name"));
	 cq.having(builder.greaterThanOrEqualTo(root.get("salary"),4100));
	 cq.orderBy(builder.asc(root.get("emp_id")));
	 Query<Object[]>query=session.createQuery(cq);
	 List<Object[]>list=query.getResultList();
	 for(Object[]ob:list)
	 {
		 System.out.print("emp_id: "+ob[0]);
		 System.out.print("emp_name: "+ob[1]);
		 System.out.print("\n");
	 }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void predicate()
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
	 CriteriaBuilder builder=session.getCriteriaBuilder();
	 CriteriaQuery cq=builder.createQuery();
	 Root<employee>root=cq.from(employee.class);
	 cq.multiselect(root.get("emp_id"),root.get("emp_name"));
	 Predicate condition=builder.and(builder.greaterThan(root.get("salary"),4100));
	 cq.where(builder.and(condition));
	 Query<Object[]>obj=session.createQuery(cq);
	 List<Object[]>ob=obj.getResultList();
	 for(Object[] o : ob)
	 {
		System.out.print("emp_id: "+o[0]); 
		System.out.print("emp_name: "+o[1]);
		System.out.print("\n");
	 }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
