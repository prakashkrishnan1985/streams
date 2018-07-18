package com.training.inter;

public class Laptop implements Comparable <Laptop> {

	String brand;
	int ram, price;
	
	public Laptop(String brand, int ram, int price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String toString() {
		return "Brand="+this.brand+", Price="+this.price+ ", RAM = "+this.ram;
	}
	
	public int compareTo(Laptop lap) {
		if(this.getRam() > lap.getRam()) {
			return 1;
		}
		
		else 
			return -1;
	}

}
