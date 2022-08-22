class Student {
	protected String fname = "Ruman";
	protected String lname = "Ali";
	protected String email = "Rumanali@gmail.com";
}
class Protected extends Student {
	private int age = 17;
	public static void main(String[] args) {
    Protected myObj = new Protected();
	System.out.println("Name is "+myObj.fname + " " +myObj.lname);
	System.out.println("Email is "+myObj.email);
	System.out.println("Age is "+myObj.age);
	}
}