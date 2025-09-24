package module3._6exercises;

public class E13CreateArray1 {
	//Exercise 13: Write code to declare and create a two-dimensional 
	//array of integers numbers with the numbers (1,2,3) in 
	//the first row, and the numbers (4,5,6) in the second row. 
	//Then loop through the two-dimensional array, printing 
	//out the values in the first row followed by those in the 
	//second row.
    public static void main(String[] args) {
        // ADD CODE HERE //
		int [][] thing = {{1,2,3}, {4,5,6}};

		for (int row = 0; row < thing.length; row++) {
			for (int col = 0; col < thing[0].length; col++) {
				System.out.print(thing[row][col] + ",");
			}
		}

    }
}

