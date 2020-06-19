package criteria;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import HQLQUERIES.pharamacy_shop;
import com.pack.HibernateUtil;

public class test {

	public static void main(String[] args) {
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			CriteriaBuilder builder=session.getCriteriaBuilder();
			CriteriaQuery<pharamacy_shop>cque=builder.createQuery(pharamacy_shop.class);
			Root<pharamacy_shop>root=cque.from(pharamacy_shop.class);
			cque.select(root);
			cque.where(builder.equal(root.get("id"),(102)));
			Query<pharamacy_shop>query=session.createQuery(cque);
			pharamacy_shop shop=query.uniqueResult();
			System.out.print("id: "+shop.getId());
			System.out.print("name: "+shop.getName());
			System.out.print("date: "+shop.getDate());
			System.out.print("price: "+shop.getPrice());
			
		}

	}

}
