class Student {
	String name;
	int Age;
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.Age);
	}
}

public class OOPS2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Ruman";
		s1.Age = 18;
		s1.printinfo();
	}
}