package com.cricket.exception;

import java.util.Date;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class ApplicationResponseEntityExceptionHandler  extends ResponseEntityExceptionHandler {
	
	Logger LOG = Logger.getLogger(ApplicationResponseEntityExceptionHandler.class);
	
	@ExceptionHandler(PlayerNotFoundException.class)
	  public final ResponseEntity<ErrorDetails> handleAllExceptions(PlayerNotFoundException ex, WebRequest request) {		
		LOG.debug("ApplicationResponseEntityExceptionHandler  {} ");			
	    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
	        request.getDescription(false));
	    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	  }


}
