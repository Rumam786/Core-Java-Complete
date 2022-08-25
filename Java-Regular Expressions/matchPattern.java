import java.util.regex.Pattern;
import java.util.regex.Matcher;
class matchPattern {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("RumanAli",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("rumanali");
		if (m.find()) {
			System.out.println("Match Found");
		} else {
			System.out.println("Match Not Found");
		}
	}
}