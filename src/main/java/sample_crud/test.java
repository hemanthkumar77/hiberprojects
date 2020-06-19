package sample_crud;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;

import com.pack.HibernateUtil;

import HQLQUERIES.pharamacy_shop;

public class test {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		int ch=0;
		Scanner obj_int=new Scanner(System.in);
		Scanner obj_string=new Scanner(System.in);
		while(ch!=5)
		{
			System.out.print("enter the options to perform the operations 1.insert 2.print 3.delete 4.update 5.terminate operation");
			ch=obj_int.nextInt();
		switch(ch)
		{
		case 1:
			session.beginTransaction();
			session.save(new pharamcy(103,"headache",new Date(),34.23));
			session.getTransaction().commit();
			System.out.print("\n");
			break;
		case 2:
			System.out.print("enter the id to see details: ");
			int val=obj_int.nextInt();
			pharamcy object=session.get(pharamcy.class,val);
			if(object!=null)
			{
				System.out.print("id:"+object.getId()+" name of the medicine: "+object.getName()+" date: "+object.getDate());
			}
			else
			{
				System.out.print("not avaliable in db");
			}
			
			System.out.print("\n");
			break;
		case 3:
			session.beginTransaction();
			System.out.print("enter the id to see delete: ");
			int val1=obj_int.nextInt();
			pharamcy object1=session.get(pharamcy.class,val1);
			if(object1!=null)
			{
				session.delete(object1);	
			}
			else
			{
				System.out.print("not avaliable in db");
			}
			session.getTransaction().commit();
			System.out.print("\n");
			break;
		case 4:
			session.beginTransaction();
			System.out.print("enter the id to change name: ");
			int val2=obj_int.nextInt();
			pharamcy object2=session.get(pharamcy.class,val2);
			if(object2!=null)
			{
				System.out.print("enter the name to change: ");
				String value=obj_string.nextLine();
				 object2.setName(value);
				 session.update(object2);		
			}
			else
			{
				System.out.print("not avaliable in db");
			}
			 session.getTransaction().commit();
			 System.out.print("\n");
			 break;
		case 5:
			System.out.print("terminated");
			System.out.print("\n");
			break;
		default:
	       System.out.print("wrongly entered the operation");
	       System.out.print("\n");
	       break;
		}
		}
		//Serializable value= 
		//System.out.print("the id stored in DB: "+value);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
