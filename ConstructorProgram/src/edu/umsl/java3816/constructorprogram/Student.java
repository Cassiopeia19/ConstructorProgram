package edu.umsl.java3816.constructorprogram;

public class Student {

	private int studentId;
	private String name;
	private String dateOfBirth;
	private String address;
	private String gpa;
	
	public Student() {}
	public Student(int studentId,String name,String dob,String add,String gpa) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfBirth = dob;
		this.address = add;
		this.gpa = gpa;
		
	}
	public Student(int StudentId, String name, int dob, String add, int gpa) {
		
	}
	public int getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public String getDateOfBirth() {
		
		return dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public String getGpa() {
		return gpa;
	}

}
