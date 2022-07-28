import java.util.*;
class A {
	public static int greaterNumber(int a , int b) {
		if (a>b) {
			return a;
		} else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Type 1st Number");
		int a = sc.nextInt();
        System.out.println("Type 2nd Number");
        int b = sc.nextInt();
        System.out.println("Your Answer is " +greaterNumber(a,b));
	}
}