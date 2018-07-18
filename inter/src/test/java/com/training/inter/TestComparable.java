package com.training.inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
	
	public static void main(String[] args) {
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("me", 10, 20));
		laptops.add(new Laptop("me2", 30, 40));
		laptops.add(new Laptop("me3", 5, 6));
		
		Collections.sort(laptops);
		
		for(Laptop laps : laptops) {
			System.out.println(laps);
		}
	}
	
	
	
	
	
	

}
