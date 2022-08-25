import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class passwordPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Password");
		String password = sc.nextLine();
		Pattern p = Pattern.compile("^[A-Za-z0-9 ]{4,20}$");
		Matcher m = p.matcher(password);
		if (m.find()) {
			System.out.println("Password is Vaild");
		} else {
			System.out.println("Invaild Password");
		}
	}
}