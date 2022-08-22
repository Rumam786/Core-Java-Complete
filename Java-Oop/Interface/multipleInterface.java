interface firstmethod {
	public void mymethod();
}
interface secondmethod {
	public void othermethod();
}
class democlass implements firstmethod,secondmethod {
	public void mymethod() {
		System.out.println("Some Text.....");
	} 
	public void othermethod() {
		System.out.println("Some other text.....");
	}
}
class multipleInterface {
	public static void main(String[] args) {
		democlass d1 = new democlass();
		d1.mymethod();
		d1.othermethod();
	}
}