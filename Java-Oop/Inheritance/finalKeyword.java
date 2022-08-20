final class Vehicle {
	protected String carname = "Benz";
	public void brandname() {
		System.out.println("Brand name is Mercedes");
	}
}
class finalKeyword extends Vehicle {
	private String modelname = "DMG";        
	public static void main(String[] args) {
		Car myObj = new Car();
		System.out.println("Car name is "+myObj.carname);
		System.out.println("Model name is "+myObj.modelname);
		myObj.brandname();
	}
}     //Car.java:7: error: cannot inherit from final Vehicle class Car extends Vehicle {