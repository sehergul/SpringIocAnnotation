package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("applicationContext.xml");

	ICustomerDal iCustomerDal = context.getBean("database",ICustomerDal.class);
//	ICustomerDal için database'de ne yazýyorsa new'le, ver demek
//	applicationContext'te öyle bir bean olmadýðý için(database) hata verir
//	hata almamak için annotation kullanmalýyýz
//	ve applicationContext'e database'e hakim olaný newlemesini yazmalýyýz
	
	iCustomerDal.add();
	
	
	}

}