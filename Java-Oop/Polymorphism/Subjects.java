class Subject {
	public void subjectmarks() {
		System.out.println("All Subjects Marks");
	}
}
class Urdu extends Subject {
	public void subjectmarks() {
		System.out.println("Urdu Marks is 62");
	}
}
class Math extends Subject {
	public void subjectmarks() {
		System.out.println("Maths Marks is 43");
	}
}
class Islamiyat extends Subject {
	public void subjectmarks() {
		System.out.println("Islamiyat Marks is 83");
	}
}
class Computer extends Subject {
	public void subjectmarks() {
		System.out.println("Computer Marks is 80");
	}
}
class Physics extends Subject {
	public void subjectmarks() {
		System.out.println("Physics Marks is 53");
	}
}
class English extends Subject {
	public void subjectmarks() {
		System.out.println("English Marks is 52");
	}
}
class Subjects {
	public static void main(String[] args) {
		Subject s1 = new Subject();
		Subject urdu1 = new Urdu();
		Subject math1 = new Math();
		Subject islam1 = new Islamiyat();
		Subject computer1 = new Computer();
		Subject physics1 = new Physics();
		Subject english1 = new English();
		s1.subjectmarks();
		urdu1.subjectmarks();
		math1.subjectmarks();
		islam1.subjectmarks();
		computer1.subjectmarks();
		physics1.subjectmarks();
		english1.subjectmarks();
	}
}