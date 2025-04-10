package com.cts.creatio.crm.language.basics;

public class SecondAssignment {

	public static void main(String[] args) {
		
		String [][][] collage = new String [5][6][2];
		
		 // Semester 1
        collage[0][0][0] = "Mathematics I";           collage[0][0][1] = "Pass(78)";
        collage[0][1][0] = "Physics";                 collage[0][1][1] = "Pass(85)";
        collage[0][2][0] = "Chemistry";               collage[0][2][1] = "Fail(21)";
        collage[0][3][0] = "Computer Programming";    collage[0][3][1] = "Pass(74)";
        collage[0][4][0] = "Engineering Drawing";     collage[0][4][1] = "Pass(88)";
        collage[0][5][0] = "Basic Electrical Eng.";   collage[0][5][1] = "Pass(79)";

        // Semester 2
        collage[1][0][0] = "Mathematics II";          collage[1][0][1] = "Pass(82)";
        collage[1][1][0] = "Mechanics";               collage[1][1][1] = "Pass(77)";
        collage[1][2][0] = "Environmental Sci.";      collage[1][2][1] = "Pass(93)";
        collage[1][3][0] = "Basic Electronics";       collage[1][3][1] = "Fail(19)";
        collage[1][4][0] = "Engineering Physics";     collage[1][4][1] = "Fail(24)";
        collage[1][5][0] = "Engineering Graphics";    collage[1][5][1] = "Pass(90)";

        // Semester 3
        collage[2][0][0] = "Data Structures";         collage[2][0][1] = "Pass(88)";
        collage[2][1][0] = "Discrete Mathematics";    collage[2][1][1] = "Pass(81)";
        collage[2][2][0] = "Digital Electronics";     collage[2][2][1] = "Pass(76)";
        collage[2][3][0] = "Operating Systems";       collage[2][3][1] = "Fail(32)";
        collage[2][4][0] = "Signals and Systems";     collage[2][4][1] = "Pass(85)";
        collage[2][5][0] = "Object-Oriented Prog.";   collage[2][5][1] = "Pass(78)";

        // Semester 4
        collage[3][0][0] = "Algorithms";              collage[3][0][1] = "Pass(91)";
        collage[3][1][0] = "Computer Networks";       collage[3][1][1] = "Pass(73)";
        collage[3][2][0] = "Database Systems";        collage[3][2][1] = "Fail(19)";
        collage[3][3][0] = "Microprocessors";         collage[3][3][1] = "Pass(80)";
        collage[3][4][0] = "Communication Eng.";      collage[3][4][1] = "Pass(76)";
        collage[3][5][0] = "Software Engineering";    collage[3][5][1] = "Pass(87)";

        // Semester 5
        collage[4][0][0] = "Probability & Stats";     collage[4][0][1] = "Pass(86)";
        collage[4][1][0] = "Machine Learning";        collage[4][1][1] = "Pass(88)";
        collage[4][2][0] = "Compiler Design";         collage[4][2][1] = "Pass(84)";
        collage[4][3][0] = "Theory of Computation";   collage[4][3][1] = "Pass(95)";
        collage[4][4][0] = "Embedded Systems";        collage[4][4][1] = "Pass(73)";
        collage[4][5][0] = "Computer Graphics";       collage[4][5][1] = "Pass(90)";
        
        
        System.out.println("Semester 2, Subject 4 Name: " + collage[1][3][0]);
        System.out.println("Semester 2, Subject 5 Name: " + collage[1][4][0]);

        System.out.println("Semester 4, Subject 3 Status/Marks: " + collage[3][2][1]);
        System.out.println("Semester 4, Subject 6 Status/Marks: " + collage[3][5][1]);
		
	}

}
