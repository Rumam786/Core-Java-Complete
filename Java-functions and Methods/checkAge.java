import java.util.*;
class A {
	public static int checkAge(int age) {
		if (age >= 18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Ineligible for vote");
		} return age;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Type Age");
		int age = sc.nextInt();
		checkAge(age);
	}
}