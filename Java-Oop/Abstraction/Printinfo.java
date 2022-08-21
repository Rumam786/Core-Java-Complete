abstract class myInfo {
	public abstract void myName();
	public abstract void myClass();
	public void myAge() {
		System.out.println("My Age is 17");
	}
}
class Print extends myInfo {
	public void myName() {
		System.out.println("My Name is Ruman");
	}
	public void myClass() {
		System.out.println("My Class is 12");
	}
}
class Printinfo {
	public static void main(String[] args) {
		Print myObj = new Print();
		myObj.myName();
		myObj.myAge();
		myObj.myClass();
	}
}