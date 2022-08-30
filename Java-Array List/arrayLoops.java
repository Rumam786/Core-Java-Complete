import java.util.ArrayList;
class arrayLoops {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		// for-Each Loop
		System.out.println("for-Each Loop");
		for (int i : list) {
			System.out.println(i);
		}
		// for Loop
		System.out.println("for Loop");
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		// while Loop
		System.out.println("While Loop");
		int i = 0;
		while (i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
	}
}