package com.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSave {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("Yogesh");
		dto.setLastName("Sen");
		dto.setLoginId("yogesh@gmail.com");
		dto.setPassword("pass123");
		dto.setDob(new Date());
		dto.setAddress("Indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(dto);
		tx.commit();
		session.close();

	}

}
