class A {
	public static void main(String[] args) {
		String firstName = "Ruman";
		String lastName = "Sukhera";
		String Empty = " ";
		String fullName = firstName + Empty + lastName;
		System.out.println("Your Full Name is : "+fullName);
		System.out.println("Full Name length is : "+fullName.length());
		for (int i=0; i<fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}
	}
}