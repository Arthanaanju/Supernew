package Oops;

public class Inhertance {

	class Animal{
		String color;
		public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog{
	String breed="pug";
	public void age() {
	System.out.println("Dog age is");
}
}
	class dog extends Animal{
		String color="white";
		
		public void bark() {
			System.out.println("Dog is barking");

		}
	}
	public class Inheritance{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		
		System.out.println("");
		System.out.println("Dog is barking");

		
		
		
		
	}

}
