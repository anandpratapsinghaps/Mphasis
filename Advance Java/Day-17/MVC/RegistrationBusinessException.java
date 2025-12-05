package com.example.mvc;
public class RegistrationBusinessException extends Exception {
   
	public RegistrationBusinessException() {
        super();
    }

    public RegistrationBusinessException(String message) {
        super(message);
    }

    public RegistrationBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegistrationBusinessException(Throwable cause) {
        super(cause);
    }
}
