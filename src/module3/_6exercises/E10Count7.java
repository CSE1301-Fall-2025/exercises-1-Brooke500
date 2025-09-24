package module3._6exercises;

public class E10Count7 {

	//Exercise 10: Complete the given code to count the number of 7's
	//in the 2D array. Add another row to the array and retest your code.
	public static void main(String[] args) {
		int[][] array = { {4,7,8},{8,8,7},{5,3,7},{2,7,4} };

		//ADD CODE HERE
		int count = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				if (array[row][col] == 7) {
				count++;
				}
			}
		}
		System.out.print("Amount of 7s: " + count);

	}
}

