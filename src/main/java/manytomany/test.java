package manytomany;

import org.hibernate.Session;

import com.pack.HibernateUtil;

public class test {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
		Student object=new Student(100,"joker","csc","second_year");
		Student object1=new Student(101,"killer_clown","IT","graduate");
		Student object2=new Student(102,"jigsaw","mechanical","freshmen");
		staffs obj=new staffs(001,"heath","senior_staff","csc");
		staffs obj1=new staffs(002,"hawkeye","junior_staff","IT");
		staffs obj2=new staffs(003,"Ted","senior_staff","mechanical");
		staffs obj3=new staffs(004,"jason","senior_staff","csc");
		obj.getStu().add(object1);
		obj.getStu().add(object);
		obj1.getStu().add(object1);
	    session.save(object);
		session.save(obj);
	    session.save(object1);
	    session.save(object2);
	  
	    session.save(obj1);
	    session.save(obj2);
	    session.save(obj3);
	     session.getTransaction().commit();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
