class Marks {
	protected int english = 74;
	protected int urdu = 63;
	protected int math = 35;
	protected int islamiyat = 82;
	protected int computer = 85;
	protected int physics = 63;
	public void studentname() {
		System.out.println("Student name is Ruman Ali");
	}
}
class subjectsMarks extends Marks {
	private int totalmarks = 399;
	public static void main(String[] args) {
		subjectsMarks myObj = new subjectsMarks();
		myObj.studentname();
		System.out.println("English marks is "+myObj.english);
		System.out.println("Urdu marks is "+myObj.urdu);
		System.out.println("Maths marks is "+myObj.math);
		System.out.println("Islamiyat marks is "+myObj.islamiyat);
		System.out.println("Computer marks is "+myObj.computer);
		System.out.println("Physics marks is "+myObj.physics);
		System.out.println("Total Marks marks is "+myObj.totalmarks);
	}
}