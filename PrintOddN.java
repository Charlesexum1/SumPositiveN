/*
 * PrintPositiveN.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * 
 * 
 * 
 */


public class PrintOddN {	
	
	public void oddLoop(int q){
		int sum = 0;
		int count = 0;		
		for (int x = 0; q > count; x++){
		if (x % 2 > 0) {
			System.out.println("Adding: " + x + " to the total sum.");
			count++;			
			sum = sum + x;
			}
		}
		System.out.println("The total sum is: " + sum);	
	}	
	
	public static void main (String args[]) {
		PrintOddN demo = new PrintOddN();
		demo.oddLoop(4);
	}
}

