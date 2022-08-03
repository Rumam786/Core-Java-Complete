class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello World");
		// Print sb
		System.out.println(sb);
		// Check index of character
		System.out.println(sb.indexOf("R"));
		// Check character at index ....
		System.out.println(sb.charAt(6));
		// Change character
		sb.setCharAt(0,'U');
		System.out.println(sb);
		// Insert Character
		sb.insert(0,"Mr");
		System.out.println(sb);
		//Insert Char
		sb.insert(0,'m');
		System.out.println(sb);
		// delete Character
		sb.delete(0,3);
		System.out.println(sb);
	}
}