package org.tomp.api.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.tomp.api.authentication.AuthenticationException;
import org.tomp.api.exceptions.MissingArgumentException;

import io.swagger.model.Error;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);

	public RestExceptionHandler() {
		log.info("ExceptionHandler active");
	}

	@ExceptionHandler({ IllegalArgumentException.class, MissingArgumentException.class, AuthenticationException.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	protected Error handleHttpMessageNotReadable(RuntimeException exception) {

		log.error(exception.getMessage(), exception);

		Error error = new Error();
		error.setCode(HttpStatus.BAD_REQUEST.name());
		error.setMessage(exception.getMessage());
		return error;
	}

	@Override
	protected ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException exception,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		log.error(exception.getMessage(), exception);

		Error error = new Error();
		error.setCode(status.name());
		error.setMessage(exception.getMessage());
		return new ResponseEntity<>(error, headers, status);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException exception,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		log.error(exception.getMessage(), exception);

		Error error = new Error();
		error.setCode(status.name());
		error.setMessage(exception.getMessage());
		return new ResponseEntity<>(error, headers, status);
	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException exception,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		log.error(exception.getMessage(), exception);

		Error error = new Error();
		error.setCode(status.name());
		error.setMessage(exception.getMessage());
		return new ResponseEntity<>(error, headers, status);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		log.error(exception.getMessage(), exception);

		Error error = new Error();
		error.setCode(status.name());
		error.setMessage(exception.getMessage());
		return new ResponseEntity<>(error, headers, status);
	}
}