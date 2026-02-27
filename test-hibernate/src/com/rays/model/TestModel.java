package com.rays.model;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestModel {
	public static void main(String[] args) {
		// testAdd();
		// testUpdate();
		// testDelete();
		// testGet();
		// testAuthenticate();
		testSearch();
	}

	public static void testAdd() {

		UserDTO dto = new UserDTO();

		dto.setFirstName("Rohit");
		dto.setLastName("Mewada");
		dto.setLoginId("rohit@gmail.com");
		dto.setPassword("rohit@123");
		dto.setGender("male");
		dto.setDob(new Date());
		dto.setAddress("Indore");

		UserModel model = new UserModel();
		model.add(dto);
	}

	public static void testUpdate() {
		UserDTO dto = new UserDTO();

		dto.setId(1);
		dto.setFirstName("Mohit");
		dto.setLastName("Chawada");
		dto.setDob(new Date());
		dto.setAddress("Indore");
		dto.setLoginId("mohit@gmail.com");
		dto.setPassword("neeraj@123");
		dto.setGender("male");

		UserModel model = new UserModel();
		model.update(dto);

	}

	public static void testDelete() {
		UserDTO dto = new UserDTO();

		dto.setId(1);

		UserModel model = new UserModel();

		model.delete(dto);
	}

	public static void testGet() {
		UserModel model = new UserModel();

		UserDTO dto = model.findbypk(1);

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());
	}

	public static void testAuthenticate() {

		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("neeraj@gmail.com", "neeraj@123");

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());
	}

	public static void testSearch() {

		UserDTO dto = new UserDTO();

		dto.setFirstName("Neeraj");

		UserModel model = new UserModel();

		List list = model.search(dto, 1, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDTO) it.next();

			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
			System.out.println(dto.getDob());
			System.out.println(dto.getAddress());
		}
	}

}
