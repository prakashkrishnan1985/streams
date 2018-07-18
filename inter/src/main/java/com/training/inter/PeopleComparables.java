package com.training.inter;

public class PeopleComparables implements Comparable<PeopleComparables>{
	
	String name;
	int age;
	
	public PeopleComparables(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return "The name of the person is: "+this.name+" and the age of the person is: "+this.age;
	}
	
	public int compareTo(PeopleComparables people) {
		int comparison = this.name.compareTo(people.name);
		if(comparison > 0) {
			return 1;
		}
		else if(comparison < 1) {
			return -1;
		}
		
		else {
			return 0;
		}
	}

}
