public class Main {
	String name = "Ruman";
	int age = 17;
}

class A {
	public static void main(String[] args) {
		Main myObj = new Main();
		System.out.println("My Name is " +myObj.name);
		System.out.println("My Age is " +myObj.age);
	}
}