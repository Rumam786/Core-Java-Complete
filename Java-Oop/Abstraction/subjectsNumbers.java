abstract class subjects {
	public abstract void english();
	public abstract void urdu();
	public abstract void math();
	public abstract void islam();
	public void computer() {
		System.out.println("Computer Marks is 78");
	}
	public void physics() {
		System.out.println("Physics Marks is 42");
	}
}
class print extends subjects {
	public void english() {
		System.out.println("English Marks is 68");
	}
	public void urdu() {
		System.out.println("Urdu Marks is 72");
	}
	public void math() {
		System.out.println("Math Marks is 49");
	}
	public void islam() {
		System.out.println("Islamiyat Marks is 79");
	}

}
class subjectsNumbers {
	public static void main(String[] args) {
		print p1 = new print();
		p1.english();
		p1.urdu();
		p1.islam();
		p1.computer();
		p1.math();
		p1.physics();
	}
}