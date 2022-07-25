import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(
                "Type studentName,fathername, Class, Rollnumber, Marks");
        // values
        String studentName = Sc.nextLine();
        String fathername = Sc.nextLine();
        String marks = Sc.nextLine();
        int Class = Sc.nextInt();
        int Rollnumber = Sc.nextInt();
        // Print
        System.out.println("Student Name is " + studentName);
        System.out.println("Father Name is " + fathername);
        System.out.println("Class is " + Class);
        System.out.println("Roll.No is " + Rollnumber);
        System.out.println("Total Marks is " + marks);
    }
}