interface Animal {
	public void dogsound();
	public void pigsound();
	public void cowsound();
	public void theysleep();
}
class Print implements Animal {
	public void dogsound() {
		System.out.println("Dog says : boo boo");
	}
	public void pigsound() {
		System.out.println("Pig says : wee wee");
	}
	public void cowsound() {
		System.out.println("Cow says : mooo");
	}
	public void theysleep() {
		System.out.println("Animals sleeps : Zzzz");
	}
}
class Animals {
	public static void main(String[] args) {
		Print p1 = new Print();
		p1.dogsound();
		p1.pigsound();
		p1.cowsound();
		p1.theysleep();
	}
}