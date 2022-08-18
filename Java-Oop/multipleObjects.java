public class multipleObjects {
	String name = "Ruman ALi";
	public static void main(String[] args) {
		multipleObjects myObj1 = new multipleObjects();
		multipleObjects myObj2 = new multipleObjects();
		myObj2.name = "Usman ALi";
		System.out.println(myObj1.name);
		System.out.println(myObj2.name);
	}
}