package Polymorphism;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.makeNoise(); // print Meo meo
		
		Animal a2 = new Dog();
		a2.makeNoise(); // print Gau gau
	}

}
