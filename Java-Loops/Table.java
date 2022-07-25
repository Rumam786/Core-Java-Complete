import java.util.*;
class A {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Type Number");
    int n = sc.nextInt();
    for ( int i = 1; i <11; i = i+1 ) {
      System.out.println(n*i);
    }
  }
}
