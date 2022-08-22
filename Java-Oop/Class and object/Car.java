public class Car {
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
	public void speed(int maxSpeed) {
	    System.out.println("Car Max Speed is : " +maxSpeed);	
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.fullThrottle();
		myCar.speed(200);	
	}
}