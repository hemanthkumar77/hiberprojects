package onetomany;

import java.util.Scanner;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
		college object=new college(103,"JOKER","HEATHLEDGER","ATLANTIC STREETH,CONNECTICUT,BRIDGEPORT-06604");
		Department obj1=new Department(001,"CSC",230,object);
		Department obj2=new Department(002,"IT",210,object);
		Department obj3=new Department(003,"ECE",180,object);
		Department obj4=new Department(004,"MECHINCAL",300,object);
		session.save(object);
		session.save(obj1);
		session.save(obj2);
		session.save(obj3);
		session.save(obj4);
		session.getTransaction().commit();
	}
}
}
