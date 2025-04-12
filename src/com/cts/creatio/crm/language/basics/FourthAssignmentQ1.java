package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class FourthAssignmentQ1 {

	public static void main(String[] args) {
		
		
		List<Integer> topfivecitiesareaArrayList = new ArrayList<Integer>();
		topfivecitiesareaArrayList.add(45); //Delhi area
		topfivecitiesareaArrayList.add(65); //bangalore area
		topfivecitiesareaArrayList.add(105); //kolkata area
		topfivecitiesareaArrayList.add(75); //hydrabad area
		topfivecitiesareaArrayList.add(85);  //Mumbai area
		
		System.out.println("Total area of 3rd and 4th Cities "+ topfivecitiesareaArrayList.get(2)+ topfivecitiesareaArrayList.get(3));
		
		

	}

}
