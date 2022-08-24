import java.util.*;

class throwKeyword {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 Years old");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Your Age");
        int age = sc.nextInt();
        checkAge(age);
        
    }
}