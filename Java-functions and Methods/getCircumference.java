import java.util.*;
class A {
	public static Double printAns(Double radius) {
		return 2*3.14*radius;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Type Number");
		Double radius = sc.nextDouble();
		System.out.println("Your Answer is " +printAns(radius));
	}
}