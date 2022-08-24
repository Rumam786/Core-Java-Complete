class finallyKeyword {
	public static void main(String[] args) {
		String[] fruits = {"Mango","Apple","Grapes","Banana"};
		try {
			System.out.println(fruits[7]);
		} catch (Exception e) {
			System.out.println("Error is "+e);
		} finally {
			System.out.println("This is Error");
		}
	}
}