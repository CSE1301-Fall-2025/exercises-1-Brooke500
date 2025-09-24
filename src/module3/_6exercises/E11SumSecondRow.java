package module3._6exercises;
public class E11SumSecondRow {

	//Exercise 11: Write code that will sum and print the
	//values in the second row of the array
	public static void main(String[] args) {
		int[][] table = { {1,4,9},{11,4,3},{2,2,3} };

		//ADD CODE HERE
		int sum = 0; // variable needed for the end
		for (int num = 0; num < table.length; num++) { // num is 0. If num is less than the length of the array table
			sum += table[1][num]; //then add the values of the array, table, at row 2 (indexed by [1]) and what num is (col), then assign it to sum
			System.out.print(table[1][num] + ", "); // print out all the numbers in row 2
		}
		System.out.println("");
		System.out.print("The sum of all of these numbers is: " + sum); //print out the sum of the numbers

	}
}
