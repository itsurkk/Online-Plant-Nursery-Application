package com.sprint;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//CENTRALIZED EXCEPTION HANDLING
@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = { IllegalArgumentException.class, NullPointerException.class,
			EntityNotFoundException.class, NoSuchElementException.class })
	public ResponseEntity<Object> IAExceptionHandler(Exception e, WebRequest request) {
		String msg = "Error in operation: " + e.getMessage();
		return handleExceptionInternal(e, msg, new HttpHeaders(), HttpStatus.CONFLICT, request);
	}

	// CUSTOM EXCEPTION HANDLING
	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<String> errorList = e.getBindingResult().getFieldErrors().stream()
				.map(fieldError -> fieldError.getDefaultMessage()).collect(Collectors.toList());
		return handleExceptionInternal(e, errorList, headers, HttpStatus.BAD_REQUEST, request);
	}
}
