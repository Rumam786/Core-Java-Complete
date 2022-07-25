
//how to get input in java
import java.util.*;//first we import package

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// then we import scanner class and pass (System.in); to get input
        String name = sc.nextLine();// then we have to store it..and we get input with the help of next function
        System.out.print(name);// and then we print it
    }
}