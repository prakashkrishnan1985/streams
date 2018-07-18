package com.training.inter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Rought {
	
	public void sortString(String input) {
		Character[] listOfChar = new Character[input.length()];
		//Pass the values of input as characters to the array
		for(int i = 0; i< input.length(); i++) {
			listOfChar[i] = input.charAt(i);
		}
		
		//Sort the characters:
		
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
		
		//Build the String back and print
		StringBuilder sb = new StringBuilder(listOfChar.length);
		for(Character c: listOfChar) {
			sb.append(c);
		}
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		new Rought().sortString("palindrone");
	}

}
