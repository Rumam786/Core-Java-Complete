class Me {
	public void myFood() {
		System.out.println("I Can Eat Food");
	}
}
class dog extends Me {
	@Override
	public void myFood() {
		System.out.println("I Can Eat Food");
	}
}
class Overriding {
	public static void main(String[] args) {
		dog d1 = new dog();
		d1.myFood();
	}
}