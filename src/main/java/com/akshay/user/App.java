package com.akshay.user;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akshay.user.dao.IUser;
import com.akshay.user.model.User;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("springBeans.xml");
		IUser userDao = (IUser)appContext.getBean("userDao");
		User u = new User();
		u.setName("Aks");
		u.setAddress("India");
		String s = UUID.randomUUID().toString();
		u.setEmailId("aks@pune"+s);
		userDao.save(u);
		
		User u1 = userDao.findUserByEmailId("aks@pune"+s);
		System.out.println(u1.getName());
	}

}
