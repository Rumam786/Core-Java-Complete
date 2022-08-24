public class nonStatic {
	public void myMethod() {
		System.out.println("My Name is Ruman Ali");
	}
}

class A {
	public static void main(String[] args) {
		nonStatic myObj = new nonStatic();
		myObj.myMethod();
	}
}