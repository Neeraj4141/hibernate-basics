package com.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.UserDTO;

public class TestDelete {
	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setId(2);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction txt = session.beginTransaction();
		session.delete(dto);
		txt.commit();
		session.close();

	}

}
