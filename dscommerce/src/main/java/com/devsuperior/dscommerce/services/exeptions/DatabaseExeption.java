package com.devsuperior.dscommerce.services.exeptions;

public class DatabaseExeption extends RuntimeException{
	
	public DatabaseExeption(String msg) {
		super(msg);
	}

}
