import java.util.*;
class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Type Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		//if else 
		if (a > b) {
			System.out.print("Greater");
		} else if (a == b) {
			System.out.print("Equal");
		} else {
			System.out.print("Lesser");
		}
	}
}