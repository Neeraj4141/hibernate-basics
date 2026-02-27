
package com.rays.aucation;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAucation {

	public static void main(String[] args) {

		Bids bid1 = new Bids();
		bid1.setId(1);
		bid1.setAmount(1000);
		bid1.setTimestamp("A");

		Bids bid2 = new Bids();
		bid2.setId(2);
		bid2.setAmount(2000);
		bid2.setTimestamp("AB");

		Bids bid3 = new Bids();
		bid3.setId(3);
		bid3.setAmount(3000);
		bid3.setTimestamp("ABC");

		Set bids = new HashSet();

		bids.add(bid1);
		bids.add(bid2);
		bids.add(bid3);

		AucationItem item = new AucationItem();
		item.setId(1);
		item.setDescription("auction 1");
		item.setBids(bids);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(item);

		tx.commit();

		session.close();

	}

}
