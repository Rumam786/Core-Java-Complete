import java.util.ArrayList;
class getElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//Add Elements
		list.add("Volvo");
		list.add("Audi");
		list.add("BMW");
		list.add("Mercedes");
		list.add("Benz");
		//Get Element
		String element = list.get(1);
		System.out.println(element);
	}
}