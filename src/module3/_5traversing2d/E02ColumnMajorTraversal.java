package module3._5traversing2d;

public class E02ColumnMajorTraversal {
	//Exercise 2: What will this code print out? Use the debugger to step
	//through the code.
	public static void main(String[] args) {
		int[][] array = { {1,2,3},{4,5,6}}; // 2 rows, 3 cols
		for (int col = 0; col < array[0].length; col++) { // col is 0. As long as col is less than the columns, the code runs
			for (int row = 0; row < array.length; row++) { //row is 0. As long as row is less than the rows of the array, the code runs
				System.out.println( array[row][col] );//print out the row and col in the array. This changes after the row is finished.
			}
		}
	}
}

