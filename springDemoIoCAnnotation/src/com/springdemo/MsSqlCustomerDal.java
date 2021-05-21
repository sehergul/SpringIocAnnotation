package com.springdemo;

import org.springframework.stereotype.Component;

@Component("database") //sadece bir yere verilmelidir
public class MsSqlCustomerDal implements ICustomerDal{
	String connectionString;

	@Override
	public void add() {
		System.out.println("Connection string: " + this.connectionString);
		System.out.println("MsSql veri tabanýna eklendi!");

	}
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
