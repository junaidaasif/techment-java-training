package test1;

class Animal{
	public void voice() {
		System.out.println("hello");
	}
}

class Dog extends Animal{
	public void voice() {
		System.out.println("Bhawwwwwwww");
	}
}

class Horse extends Animal{
	public void voice() {
		System.out.println("hehehehe");
	}
}

class Cat extends Animal{
	public void voice() {
		System.out.println("Meowwww");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		dog.voice();
		Animal horse = new Horse();
		horse.voice();
		Animal cat = new Cat();
		cat.voice();
		

	}

}
