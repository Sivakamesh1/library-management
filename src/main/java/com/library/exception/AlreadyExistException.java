package com.library.exception;

import lombok.Getter;

@Getter
public class AlreadyExistException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	public AlreadyExistException(String message) {
	        super(message);
	    }
	    private String message;
}
