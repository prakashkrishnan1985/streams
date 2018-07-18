package com.training.inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPeopleComparable {
	
	public static void main(String[] args) {
		List<PeopleComparables> peopleList = new ArrayList<PeopleComparables>();
		
		peopleList.add(new PeopleComparables("jackson", 33));
		peopleList.add(new PeopleComparables("jade", 33));
		peopleList.add(new PeopleComparables("steve", 33));
		peopleList.add(new PeopleComparables("Amy", 33));


		
		Collections.sort(peopleList);
		
		for(PeopleComparables people : peopleList) {
		
			System.out.println(people);
		}
	}

}
