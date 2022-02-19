package hw3Q2JavaVariables;

public class AboutMe {

	public String name = "Taslima Barna";
	public byte age = 27;
	public char sex = 'F';
	public long bankBalance = 420000l;
	public float height = 5.513f;
	public int yearlySalary = 75000;
	public double myGrade = 4.5669;
	public short houseRent = 2900;
	public boolean usCitizen = true;

	// Here myInfo variable is declared as I didn't assign any value of it. And
	// 'myName' , 'mySalary' , 'sex' , 'myAge' , 'usCitizen', etc. all the variables
	// are initialized because I assign their value.

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println("Name: " + aboutMe.name + "\nAge:" + aboutMe.age + "\nSex:" + aboutMe.sex + "\nBankbalance:"
				+ aboutMe.bankBalance + "\nHeight:" + aboutMe.height + "\nYearlysalary:" + aboutMe.yearlySalary
				+ "\nMygrade:" + aboutMe.myGrade);

	}

}
