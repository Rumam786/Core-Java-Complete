class cat {
	public void catfood() {
		System.out.println("Cat Can Eat Cat Food");
	}
}
class dog extends cat {
	public void catfood() {
		super.catfood();
		System.out.println("Dog Can Eat dog Food");
	}
}
class superKeyword {
	public static void main(String[] args) {
		dog d1 = new dog();
		d1.catfood();
	}
}
