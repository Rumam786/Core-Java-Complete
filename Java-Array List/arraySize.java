import java.util.ArrayList;
class arraySize {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		// List Size
		int element = list.size();
		System.out.println(element);
	}
}