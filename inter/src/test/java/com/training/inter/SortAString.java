package com.training.inter;

import java.util.Arrays;
import java.util.Comparator;

public class SortAString {
	
	//Given the input String the program should sort the string alphabetically and print the values
	//e.g input: palindrone
	//Output: adeillnnopr
	
	public void compareString(String input) {
		Character[] listOfChar = new Character[input.length()];
		//Transfer the character to this character array
		
		for(int i = 0; i <input.length(); i++) {
			
			listOfChar[i] = input.charAt(i);
			
		}
		
		Arrays.sort(listOfChar, new Comparator<Character>() {
			public int compare(Character c1, Character c2) {
				if(Character.getNumericValue(c1) > Character.getNumericValue(c2)) {
					return 1;
				}
				
				else if(Character.getNumericValue(c1) == Character.getNumericValue(c2)) {
					return 0;
				}
				else {
					return -1;
				}
			}
		});
		
		//Add the sorted string to the String builder to print
		
		StringBuilder sb = new StringBuilder(listOfChar.length);
		for(Character val: listOfChar) {
			sb.append(val);
		}
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		new SortAString().compareString("plalindrone");
	}

}
