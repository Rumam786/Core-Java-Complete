class Students {
	protected String fname = "Ruman";
	protected String lname = "Ali";
	protected int myClass = 11;
	protected int myRollNo = 13168;
	public void sectionname() {
		System.out.println("Section is B-10");
	}
}
class myInfo extends Students {
	private int attendence = 172;
	public static void main(String[] args) {
		myInfo myObj = new myInfo();
		System.out.println("Name is "+myObj.fname +" "+myObj.lname);
		System.out.println("Class is "+myObj.myClass);
		System.out.println("Roll No is "+myObj.myRollNo);
		myObj.sectionname();
		System.out.println("Total marks is "+myObj.attendence);
	}
}