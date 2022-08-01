class A {
	public static void main(String[] args) {
		int[][] marks = {{1,2,3,4,5} , {6,7,8,9,10}};
		for (int i = 0; i<marks.length; i++) {
			for (int j = 0; j<marks[i].length; j++) {
				System.out.println(marks[i][j]);
			}
		}
 	}
}