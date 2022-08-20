class Vehicle {
	protected String brand = "Ford";
	public void carname() {
		System.out.println("Mercedes");
	}
}
class inheritance extends Vehicle {
	private String modelname = "Benz";
	public static void main(String[] args) {
		inheritance myObj = new inheritance();
		System.out.println("Brand name is "+myObj.brand);
		System.out.print("Car name is ");
		myObj.carname();
		System.out.println("Model name is "+myObj.modelname);
	}
}