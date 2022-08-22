public class Final {
	final int x = 10;
	public static void main(String[] args) {
		finalAttribute myObj = new finalAttribute();
	//	myObj.x = 20;       //  error: cannot assign a value to final variable x
		System.out.println(myObj.x);
	}
}