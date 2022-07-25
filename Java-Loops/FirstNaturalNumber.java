import java.util.*;

class A {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Type Number");
		int n = input.nextInt();
		int sum = 0;
		for ( int i = 0; i <=n; i++ ) {
			sum = sum+i;
		}
		System.out.print(sum);
	}
}
