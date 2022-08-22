class Animal {
	public void animalsays() {
		System.out.println("Animals makes a sound");
	}
}
class pig extends Animal {
	public void animalsays() {
		System.out.println("pig says wee wee");
	}
}
class dog extends Animal {
	public void animalsays() {
		System.out.println("Dog says boo boo");
	}
}
class Animals {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal mypig = new pig();
		Animal mydog = new dog();
		myAnimal.animalsays();
		mypig.animalsays();
		mydog.animalsays();
	}
}