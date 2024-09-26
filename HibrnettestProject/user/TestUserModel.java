package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {
	public static void main(String[] args) {
		//testadd();
		//testupdate();
		//testget();
		//testdelete();
		//testauthenticate();
		testsearch();
	}

	private static void testadd() {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Akshat");
		dto.setLastName("soni");
		dto.setLoginId("abc@gmail.com");
		dto.setPassword("pass");
		dto.setDob(new Date());
		dto.setAddress("indore");

		UserModel model = new UserModel();

		model.add(dto);

	
	}

	private static void testupdate() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("Bhavesh");
		dto.setLastName("Sen");
		dto.setLoginId("bcd@gmail.com");
		dto.setPassword("pass");
		dto.setDob(new Date());
		dto.setAddress("Chittor");

		UserModel model = new UserModel();

		model.update(dto);
	}

	private static void testget() {
		UserModel model = new UserModel();

		UserDTO dto = model.findByPK(1);

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());
	}

	private static void testdelete() {
		UserDTO dto = new UserDTO();
		dto.setId(2);

		UserModel model = new UserModel();

		model.delete(dto);
	}

	private static void testauthenticate() {
		UserModel model = new UserModel();
		UserDTO dto = model.authenticate("bcd@gmail.com", "pass");

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		} else {
			System.out.println("Authentication failed..!!");
		}
	}

	private static void testsearch() {
		UserDTO dto = new UserDTO();
        UserModel model = new UserModel();
        List list = model.search(dto, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDTO) it.next();
			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		}
	}


}
