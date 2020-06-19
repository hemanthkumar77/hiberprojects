package Batching;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.HibernateUtil;

public class test {

	public static void main(String[] args) {
		Transaction tx=null;
		int batchsize=20;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			
			tx=session.beginTransaction();
			for(int i=0;i<100;i++)
			{
				example object=new example();
				object.setId(i);
				object.setName("name_"+i);
				session.persist(object);
				if(i>0  && i% batchsize==0)
				{
					System.out.print("batch_updated");
					session.flush();
					session.clear();
				}
			}
			
			tx.commit();
		}
		catch(Exception e)
		{
			if(tx!=null)
			{
				e.printStackTrace();
			}
		}
	}

}
