class A {
	public static void main(String[] args) {
		String Name1 = "Ruman";
		String Name2 = "Ali";
		if (Name1.compareTo(Name2) > 0) {
			System.out.println("Name1 is greater");
		} else if (Name1.compareTo(Name2) < 0) {
			System.out.println("Name1 is lesser");
		} else {
			System.out.println("Strings are Equal");
		}
	}
}