package com.cricket.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PlayerNotFoundException extends RuntimeException {
	
	public PlayerNotFoundException(String exception) {
	    super(exception);
	  }


}
