package com.devsuperior.dscommerce.services.exeptions;

public class ResourceNotFoundExeption extends RuntimeException{
	
	public ResourceNotFoundExeption(String msg) {
		super(msg);
	}

}
