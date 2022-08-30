import java.util.ArrayList;
class removeElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		// Remove Element
		list.remove(1);
		System.out.println(list);
	}
}