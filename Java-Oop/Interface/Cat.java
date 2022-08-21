interface Firstinterface {
	public void catsound();
	public void catsleep();
}
class Animal implements Firstinterface { 
	public void catsound() {
		System.out.println("Cat says : meow");
	}
	public void catsleep() {
		System.out.println("Cat sleeps : Zzzz");
	}
}
class Cat {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.catsound();
		a1.catsleep();
	}
}