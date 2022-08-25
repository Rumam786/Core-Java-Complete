import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class phoneNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Phone Number");
		String phoneNumber = sc.nextLine();
		Pattern p = Pattern.compile("^[0][3][0-9]{2}[ ][0-9]{7}$");
		Matcher m = p.matcher(phoneNumber);
		if (m.find()) {
			System.out.println("Vaild Phone Number");
		} else {
			System.out.println("Invaild Phone Number");
		}
	}
}