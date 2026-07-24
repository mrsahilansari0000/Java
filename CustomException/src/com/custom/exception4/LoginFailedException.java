package com.custom.exception4;

public class LoginFailedException extends RuntimeException {
	LoginFailedException(String message){
		super(message);
	}
}
