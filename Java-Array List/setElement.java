import java.util.ArrayList;
class setElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		// Set element at specific index
		list.set(1,9);
		System.out.println(list);
	}
}