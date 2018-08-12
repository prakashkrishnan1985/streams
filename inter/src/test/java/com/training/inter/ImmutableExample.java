package com.training.inter;

public class ImmutableExample {
	
	/*
	 * Class should be final
	 * All variables are final
	 * Getter for all variables
	 * No setters
	 */
	
	
	private final String company;
	private final int doorNumber;
	
	
	public ImmutableExample(String company, int doorNumber) {
		this.company = company;
		this.doorNumber = doorNumber;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public int doorNumber() {
		return this.doorNumber;
	}

}
