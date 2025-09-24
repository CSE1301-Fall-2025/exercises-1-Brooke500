package module3._5traversing2d;

public class E012DArrayTraversal {

	//Exercise 1: What will this print? Use the debugger to step through the code.
	//What happens if you add another row to the array?
	public static void main(String[] args) {
		int[][] a = { {1,2,3},{4,5,6}}; //tells me the separation between the first and second row
		double total = 0;
		int value = 0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {//annnnnnnd, we're back to the nested loop structure.
				value = a[row][col]; 					 //it's becuase there is one loop per dimension
				total = total + value;
			}
		}
		System.out.println(total / (a.length * a[0].length));
	}
}

