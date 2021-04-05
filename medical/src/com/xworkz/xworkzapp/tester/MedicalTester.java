package com.xworkz.xworkzapp.tester;

public class MedicalTester {

	public static void main(String[] args) {
		
		String words=
				"Banglore is also called as it hub Banglore recently awarded best city  to live Banglore is also called as green city Banglore is capital city of karnataka";
			
		int count;
		
	    String str[]=words.split(" ");
		
		System.out.println("Duplicate words in a given String : ");
		
		for (int i = 0; i < str.length; i++) {
			count=1;
			for (int j = i+1; j < str.length; j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="0";   //set str[j] to 0 to avoid printing visited word
				}
			}
			if(count > 1 && str[i]!="0")  //display the duplicate word if count is greater than 1
				System.out.println(str[i]);
			}
		
		}
	}
