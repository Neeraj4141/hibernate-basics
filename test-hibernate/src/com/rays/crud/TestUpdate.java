package com.rays.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.UserDTO;

public class TestUpdate {
	public static void main(String[] args) {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("Neeraj");
		dto.setLastName("Mewada");
		dto.setDob(new Date());
		dto.setLoginId("neeraj@gmail.com");
		dto.setPassword("Neeraj@123");
		dto.setAddress("Indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(dto);
		tx.commit();
		session.close();

	}

}
