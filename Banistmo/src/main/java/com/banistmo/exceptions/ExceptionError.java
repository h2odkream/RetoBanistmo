package com.banistmo.exceptions;

public class ExceptionError extends AssertionError {
	public static final String NO_DOWNLOAD_PDF = "could not download the pdf";

	public ExceptionError(String message, Throwable cause) {
		super(message, cause);
	}

}
