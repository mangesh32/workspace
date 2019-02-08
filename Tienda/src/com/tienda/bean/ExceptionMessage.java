package com.tienda.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="exception-msg")
public class ExceptionMessage {
	private String message;
	

	public ExceptionMessage() {
		super();
	}


	public ExceptionMessage(String message) {
		super();
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "ExceptionMessage [message=" + message + "]";
	}
	
	
	
	
	
}
