package hw6Q2IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		int age = 22;

		if (age == 18) {
			System.out.println("I am a voter");
		} else if (age < 18) {
			System.out.println("i am not a voter");
		} else if (age > 18) {
			System.out.println("i am a voter");
		} else {
			System.out.println("Please add a valid age");
		}

	}
}