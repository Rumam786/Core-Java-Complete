import java.util.ArrayList;
class addElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		// Add Element at specific index
		list.add(1,5);
		System.out.println(list);
	}
}