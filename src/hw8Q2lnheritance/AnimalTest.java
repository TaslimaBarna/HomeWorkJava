package hw8Q2lnheritance;

public class AnimalTest {
	public static void main(String[] args) {
		// From Animal class Mammal, Reptile, Birds are hierarchical inheritance.
		// Animal class is the parent class of Mammal,Reptile and Birds.
		System.out.println("\n--------Animal--------\n");
		Animal animal = new Animal();
		animal.AnimalInfo();

		// Mammal Reptile and Birds are also called child class of Animal class.
		System.out.println("\n--------Mammal--------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.AnimalInfo();

		// Reptile inherits the properties from a single class.
		// parent class (Animal) as example single inheritance.
		System.out.println("\n--------Reptile--------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.AnimalInfo();

		// Hierarchical Inheritance example--> Mammal,Reptile & Birds extends to one
		// base class Animal.
		// More than one derived class is created from a single parent class.
		System.out.println("\n--------Birds--------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.AnimalInfo();

		System.out.println("\n--------Dog--------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.AnimalInfo();

		System.out.println("\n--------Snake--------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.AnimalInfo();

		System.out.println("\n--------Robin--------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.AnimalInfo();

		System.out.println("\n--------BullDog--------\n");
		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.AnimalInfo();

		// Cobra extends s Snake, Snake extends Reptile, Reptile extends Animal.
		// A derived class is created from another derived class.This is called
		// Multilevel inheritance.
		System.out.println("\n--------Cobra--------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.AnimalInfo();
	}

}
