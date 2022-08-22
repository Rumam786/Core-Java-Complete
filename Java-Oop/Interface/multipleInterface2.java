interface firstmethod {
	public void myname();
}
interface secondmethod {
	public void myage();
}
interface thirdmethod {
	public void myclass();
}
class add implements firstmethod,secondmethod,thirdmethod {
	public void myname() {
		System.out.println("My Name is Ruman Ali");
	}
	public void myage() {
		System.out.println("My Age is 17");
	}
	public void myclass() {
		System.out.println("MY class is 12");
	}
}
class multipleInterface2 {
	public static void main(String[] args) {
		add a1 = new add();
		a1.myname();
		a1.myage();
		a1.myclass();
	}
}