import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class namePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Your Name");
		String name = sc.nextLine();
		Pattern p = Pattern.compile("^[A-Za-z ]{3,20}$");
		Matcher m = p.matcher(name);
		if (m.find()) {
			System.out.println("Name is Vaild");
		} else {
			System.out.println("Name is Invaild");
		}
	}
}