class C {
	public void show()
	{
		System.out.println("Show World");
	}
	public static void main(String[] args) {
		C MyObj = new C();
		MyObj.show();
		System.out.println("Reference!");
	}
}