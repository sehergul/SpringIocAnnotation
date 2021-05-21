package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");

	ICustomerDal iCustomerDal = context.getBean("database",ICustomerDal.class);
//	ICustomerDal i�in database'de ne yaz�yorsa new'le, ver demek
//	applicationContext'te �yle bir bean olmad��� i�in(database) hata verir
//	hata almamak i�in annotation kullanmal�y�z
//	ve applicationContext'e database'e hakim olan� newlemesini yazmal�y�z
	
	iCustomerDal.add();
	
	
	}

}