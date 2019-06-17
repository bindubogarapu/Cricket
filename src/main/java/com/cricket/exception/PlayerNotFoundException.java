package com.cricket.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PlayerNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -2095099845402335460L;
	

	public PlayerNotFoundException(String exception) {
	    super(exception);
	  }


}
