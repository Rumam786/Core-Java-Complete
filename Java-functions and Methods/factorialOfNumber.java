import java.util.*;
class D {
	public static void printfactorial (int n) {
        //for-loop
        int Factorial = 1;
		if (n < 0) {
		System.out.println("Invaild Number");
		}
        for (int i = n; i>=1; i--) {
        Factorial = Factorial*i;
        }
        System.out.println(Factorial);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Number");
        int n = sc.nextInt();
        System.out.println("Your Answer is");
        printfactorial(n);
	}
}
