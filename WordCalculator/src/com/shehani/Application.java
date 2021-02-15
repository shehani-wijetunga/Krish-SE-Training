package com.shehani;

import java.util.*;

class Application{
	public static void main(String args[]) {
		
		Scanner word= new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word1=word.nextLine();
		
		String[]  letter=new String[word1.length()];
		letter=word1.split("");
		
		for(int i;i>letter.length;i++) {
			int total=0;
			switch(letter[i]) {
			case "a":
				total= total+1;break;
			case "A":
				total= total+1;break;
			case "b":
				total= total+1;break;
			case "B":
				total= total+1;break;
				//to whole alphabet
				
			}
			System.out.println("Word value is "+total);
			
		}
	}
}