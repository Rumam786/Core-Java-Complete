import java.util.*;
class name {
	public static String printName(String name) {
        System.out.println(name);
        return name; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Name");
		String name = sc.nextLine();
		System.out.println("Your Input");
        printName(name);
	}
}