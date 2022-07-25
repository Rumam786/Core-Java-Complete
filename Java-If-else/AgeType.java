import java.util.*;
class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Your Age");
		int Age = sc.nextInt();
		//if else
		if (Age > 18) {
			System.out.print("You Are Adult");
		} else {
			System.out.print("You Are Not Adult");
		}
	}
}