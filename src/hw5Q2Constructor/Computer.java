package hw5Q2Constructor;

public class Computer {
	// Variables are declared here.
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	// Default constructor is declared here.
	public Computer(){
		System.out.println("This is from default Constractor Computer Class");
	}

	// Parameterized constructor declared here.
	public Computer(String brand, String model, String operatingSystem, int price, Boolean madeInUSA, char grade) {

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;

		System.out.println("My Brand:" + brand + "model:" + model + "operatingSystem:" + operatingSystem + "price:"
				+ price + "madeInUSA:" + madeInUSA + "grade:" + grade);
	}

}
