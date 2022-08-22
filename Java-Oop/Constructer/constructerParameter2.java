public class constructerParameter2 {
	int x;
	public constructerParameter2(int y) {
		x = y;
	}
	public static void main(String[] args) {
		constructerParameter2 Obj = new constructerParameter2(5);
		System.out.println(Obj.x);
	}
}