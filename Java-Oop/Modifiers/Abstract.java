abstract class Animal {
	public abstract void animalsound();
	public void animalsleep() {
		System.out.println("Zzzz");
	}
}
class pig extends Animal {
	public void animalsound() {
		System.out.println("pig says : wee wee");
	}
}
class Abstract {
	public static void main(String[] args) {
		pig newPig = new pig();
		newPig.animalsound();
		newPig.animalsleep();
	}
}