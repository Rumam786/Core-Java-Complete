import java.util.*;
class A {
	public static void main(String[] args) {
		Scanner op = new Scanner (System.in);
		System.out.println("Type Subject name");
		String button = op.nextLine();
		if (button.equals("english")) {
			System.out.println("English marks is 10");
		} else if (button.equals("urdu")) {
			System.out.println("Urdu marks is 20");
		} else if (button.equals("islamiyat")) {
			System.out.println("Islamiyat marks is 30");
		} else if (button.equals("math")) {
			System.out.println("Maths marks is 40");
		} else if (button.equals("physics")) {
			System.out.println("Physics marks is 50");
		} else {
			System.out.print("Invaild");
		}
	}
}