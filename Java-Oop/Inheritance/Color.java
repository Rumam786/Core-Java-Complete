class Shape {
	String color;
}
class triangle extends Shape {

}
class Color {
	public static void main(String[] args) {
		triangle t1 = new triangle();
		t1.color = "red";
		System.out.println(t1.color);
	}
}