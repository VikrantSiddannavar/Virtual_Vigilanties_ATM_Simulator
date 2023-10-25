package com.icici;

public class InvalidChoiceExceeption extends RuntimeException{
	
private String messege;
	
	public void InvalidChoiceException(String messege) {
		this.messege = messege;
		
	}
	
	public String getMessege(){
		return messege;
	
}
}