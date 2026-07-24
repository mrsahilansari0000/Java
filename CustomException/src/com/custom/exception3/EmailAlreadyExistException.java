package com.custom.exception3;

public class EmailAlreadyExistException extends RuntimeException {
	EmailAlreadyExistException(String message){
		super(message);
	}
}
