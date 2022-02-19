package hw4Q2JavaVariables;

public class AboutMe {
	// All the variable are declared here.
	public String name;
	public byte age;
	public char sex;
	public long bankBalance;
	public float height;
	public int yearlySalary;
	public double myGrade;
	public short houseRent;
	public boolean usCitizen;

	// constructor is declared here.
	public AboutMe() {
		System.out.println("This is all about me:");
	}

	// method is implemented here.
	public void AbotMe() {
		System.out.println("Name: " + name + "\nAge:" + age + "\nSex:" + sex + "\nBankbalance:" + bankBalance
				+ "\nHeight:" + height + "\nYearlysalary:" + yearlySalary + "\nMygrade:" + myGrade);

	}

}
