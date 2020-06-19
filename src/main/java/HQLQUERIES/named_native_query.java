package HQLQUERIES;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import com.pack.HibernateUtil;

public class named_native_query {
public static void main(String args[])
{
	try(Session session=HibernateUtil.getSessionFactory().openSession())
	{
		session.beginTransaction();
		Query<Object[]>query=session.createNativeQuery("select id,name,strength from department order by strength").addScalar("id",IntegerType.INSTANCE).addScalar("name",StringType.INSTANCE).addScalar("Strength",IntegerType.INSTANCE);
        List<Object[]>list=query.list();
        for(Object[] obj:list)
        {
        	System.out.print("id: "+obj[0]);
        	System.out.print("name: "+obj[1]);
        	System.out.print("strength: "+obj[2]);
        	System.out.print("\n");
        	
        }
	}
}
}
