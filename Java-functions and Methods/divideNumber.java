import java.util.*;
class B {
	public static int calculateSum(int a ,int b ) {
        int sum = a / b;
        return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type first Number");
		int a = sc.nextInt();
		System.out.println("Type 2nd Number");
		int b = sc.nextInt();
		System.out.println("Your Answer is");
		int divide = calculateSum(a,b);
		System.out.println(divide);
	}
}