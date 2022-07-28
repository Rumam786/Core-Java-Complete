import java.util.*;
class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[5]; 
		System.out.println("English marks");
		marks[0] = sc.nextInt();
		System.out.println("Urdu marks");
		marks[1] = sc.nextInt();
		System.out.println("Islamiyat marks");
		marks[2] = sc.nextInt();
		System.out.println("Math marks ");
		marks[3] = sc.nextInt();
		System.out.println("Physics marks");
		marks[4] = sc.nextInt();
		System.out.println("Marks List");
		for (int i=0;i<5;i++) {
			System.out.println(marks[i]);
		}
	}
}