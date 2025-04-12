package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class FourthAssignmentQ4 {

	public static void main(String[] args) {
		
		List<String> top5highestgrossingmoviesArrayList = new ArrayList<String>();
		top5highestgrossingmoviesArrayList.add("Avatar"); 
		top5highestgrossingmoviesArrayList.add("Avengers: Infinity War"); 
		top5highestgrossingmoviesArrayList.add("Titanic"); 
		top5highestgrossingmoviesArrayList.add("Star Wars: The Force Awakens"); 
		top5highestgrossingmoviesArrayList.add("Furious 7");  
		
		System.out.println("The third highest-grossing movie is:" + top5highestgrossingmoviesArrayList.get(2));

	}

}
