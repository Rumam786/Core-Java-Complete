class C {
	void show()
	{
		System.out.println("Show World");
	}
	public static void main(String[] args) {
		C ref = new C();
		ref.show();
		System.out.println("Reference!");
	}
}