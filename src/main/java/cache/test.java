package cache;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.HibernateUtil;

import HQLQUERIES.pharamacy_shop;
import onetomany.Department;

public class test {
public static void main(String args[])
{
	Transaction tx=null;
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		Scanner obj_int=new Scanner(System.in);
		System.out.print("enter the id: ");
		int id=obj_int.nextInt();
		pharamacy_shop object=session.get(pharamacy_shop.class,id);
		if(object!=null)
		{
		System.out.print("name: "+object.getName()+" "+"strength: "+object.getName()+" "+"cost: "+object.getPrice());
		tx=session.beginTransaction();
		if(tx!=null)
		{
		object.setName("protien");
		session.update(object);
		session.getTransaction().commit();
		}
		
		}
	}
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		Scanner obj_int=new Scanner(System.in);
		System.out.print("enter the id: ");
		int id=obj_int.nextInt();
		pharamacy_shop object=session.get(pharamacy_shop.class,id);
		if(object!=null)
		{
		System.out.print("name: "+object.getName()+" "+"strength: "+object.getName()+" "+"cost: "+object.getPrice());
		tx=session.beginTransaction();
		if(tx!=null)
		{
		object.setName("minerals");
		session.update(object);
		session.getTransaction().commit();
		}
		
		}
	}
}
}
