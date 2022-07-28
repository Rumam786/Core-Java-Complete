import java.util.*;
class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Type 1st Number");
		int a = sc.nextInt();
		System.out.println("Type 2nd Number");
		int b = sc.nextInt();
		System.out.println("Type 3rd Number");
		int c = sc.nextInt();
		//average
		int average = (a + b + c) / 3;
		System.out.println("Your Answer is " + average);
	}
}