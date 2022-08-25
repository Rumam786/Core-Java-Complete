import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class emailPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type Email");
		String email = sc.nextLine();
		Pattern p = Pattern.compile("^[A-Za-z0-9@.]{15,35}$");
		Matcher m = p.matcher(email);
		if (m.find()) {
			System.out.println("Vaild Email");
		} else {
			System.out.println("Invaild Email");
		}
	}
}