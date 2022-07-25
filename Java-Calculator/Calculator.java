import java.util.Scanner;
class A {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//first number
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		//second number
		System.out.println("Enter Second number");
		int num2 = input.nextInt();
		//scanner op
		Scanner op = new Scanner (System.in);
		//choose operation
		System.out.println("Choose an operation : +, -, *, /, %");
		String operation = op.next();
		//if else statement
		if (operation.equals ("+") ) {
			System.out.println("Your answer is " + ( num1 + num2 ) );
		} else if (operation.equals ("-") ) {
		    System.out.println("Your answer is " + ( num1 - num2 ) );
		} else if (operation.equals ("*") ) {
			System.out.println("Your answer is " + ( num1 * num2 ) );
		} else if (operation.equals ("/") ) {
			System.out.println("Your answer is " + ( num1 / num2 ) );
		} else if (operation.equals ("%") ) {
			System.out.print("Your answer is " + ( num1 % num2 ) );
		} else {
			System.out.print("Invaild operation");
		}
	}
}