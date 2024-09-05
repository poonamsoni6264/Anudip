package animal_overriding;

//this is a superclass called Animal
public class Animal {
	//superclass method which simply print "The Animal class sound".
	public void makeSound() {
		System.out.println("The Animal class sound");
	}
	
   public static void main(String[] args) {
	   //call in main function
	   Animal an = new Animal();//This is a superclass call 
	   an.makeSound();
	   
	   //now we create Dog subclass object by reference variable from superclass
	   an = new Dog();
	   an.makeSound();
	   
	   // then we create Cat subclass object by reference variable from superclass
	   an = new Cat();
	   an.makeSound();
   }
}

//two subclass of Animal
//first subclass is Dog
class Dog extends Animal{
	//Dog override the superclass method with different implementation
	public void makeSound() {
		System.out.println("The Dog barks");
	}
}

//second subclass is cat
class Cat extends Animal{
	//Cat override the superclass method with different implementation
		public void makeSound() {
			System.out.println("The Cat meows");
		}
}



