package HQLQUERIES;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pack.HibernateUtil;

public class delete {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		int ID=103;
		String Hql="delete from pharamacy_shop where id=:ID";
       Query query=session.createQuery(Hql);
       query.setParameter("ID", ID);
       session.beginTransaction();
       int varaiable=query.executeUpdate();
       if(varaiable>0)
       {
    	   System.out.print("deleted the record");
       }
       else
       {
    	   System.out.print("record not in DB");
       }
       session.getTransaction().commit();
	}
}
}
