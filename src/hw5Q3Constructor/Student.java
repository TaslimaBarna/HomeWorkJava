package hw5Q3Constructor;

public class Student {
	// Variables are declared here.
	public String stName;
	public int stID;
	public char sex;
	public Float grade;
	public Boolean isProgrammer;

	// Default constructor is declared here.
	public Student() {
		System.out.println("This is fron the default constructor");
	}

	// Here is parameterized constructor.

	public Student(String stName, int stID, char sex, float grade, Boolean isProgrammer) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;
		this.isProgrammer = isProgrammer;

		System.out.println("stName:" + stName + "stID:" + stID + " sex:" + sex + " grade:" + grade + " isProgrammer:"
				+ isProgrammer);

	}
}