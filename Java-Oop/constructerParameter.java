public class constructerParameter {
	String myName;
	int Dob;
	public constructerParameter(String name, int year) {
		myName = name;
		Dob = year;
	}
	public static void main(String[] args) {
		constructerParameter myObj = new constructerParameter ("Ruman Ali", 2005);
		System.out.println(myObj.myName);
		System.out.println(myObj.Dob);
	}
}