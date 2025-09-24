package module3._6exercises;

public class E09Colors {
	//Exercise 9: declare and create a two-dimensional array 
	//of strings named colors. Put the colors (�red�, 
	//�yellow�, �blue�) in the first row, and the 
	//colors (�orange�, �green�, �purple�) in the second row. 
	//Then print every value in the array.
	public static void main(String[] args) {
		// ADD CODE HERE //
		String [][] colors = {{"red", "yellow", "blue"} , {"orange", "green", "purple"}};

		for (int row = 0; row < colors.length; row++) {
			for (int col = 0; col < colors[0].length; col++) {
				System.out.print(colors[row][col] + ", ");
			}
		}
	}
}

