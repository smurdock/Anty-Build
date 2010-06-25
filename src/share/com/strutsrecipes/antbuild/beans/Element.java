package com.strutsrecipes.antbuild.beans;

public class Element {
	private String name;
	private String symbol;
	private String number;
	private String mass;



	public Element() {
		super();
	}


	public Element(String name, String symbol, String number, String mass) {
		this.name = name;
		this.symbol = symbol; 
		this.number = number; 
		this.mass = mass;
	}


	public String getMass() {
		return mass;
	}


	public String getName() {
		return name;
	}


	public String getNumber() {
		return number;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setMass(String mass) {
		this.mass = mass;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
