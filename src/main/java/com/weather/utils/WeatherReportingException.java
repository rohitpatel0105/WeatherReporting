package com.weather.utils;

import org.springframework.http.HttpStatus;
/**
 * @author rohit.patel
 *
 */
public class WeatherReportingException extends Exception {

	private static final long serialVersionUID = 1L;

	private HttpStatus httpStatus;
	
	public WeatherReportingException(String errorMessage, HttpStatus httpStatus) {
		super (errorMessage);
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
}
