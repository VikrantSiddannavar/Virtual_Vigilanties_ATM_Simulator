package com.icici;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException {
	private String messege;
	
	public InsufficientBalanceException(String messege) {
		this.messege = messege;
	}
	
	public String getMessege() {
		return messege;
	}

}
