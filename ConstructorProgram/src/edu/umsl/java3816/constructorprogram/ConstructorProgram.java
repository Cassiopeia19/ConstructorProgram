package edu.umsl.java3816.constructorprogram;

public class ConstructorProgram {
	

	public static void main(String[] args) {
		Student s = new Student(123,"Woodrow Wilson","01/01/1891","100 Gatlinburg Avenue","3.25");

		System.out.println("Student ID: " + s.getStudentId() + " Student name: " + s.getName()
		+ " address: " + s.getAddress() + " GPA: " + s.getGpa());
	}

	
			
		

}
