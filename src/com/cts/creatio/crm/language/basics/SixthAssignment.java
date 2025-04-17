package com.cts.creatio.crm.language.basics;

public class SixthAssignment {

	public static void main(String[] args) {
		   String[] names = {"Suresh", "Mahesh", "Naresh"};
	        int[] marks = {75, 80, 82};

	        // Add 10 marks to each
	        int m1 = marks[0] + 10;
	        int m2 = marks[1] + 10;
	        int m3 = marks[2] + 10;

	        // Calculate average
	        double average = (m1 + m2 + m3) / 3.0;

	        // Output
	        System.out.println("Updated Marks:");
	        System.out.println(names[0] + ": " + m1);
	        System.out.println(names[1] + ": " + m2);
	        System.out.println(names[2] + ": " + m3);
	        System.out.println("Average Marks: " + average);

	}

}
