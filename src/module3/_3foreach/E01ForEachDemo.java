package module3._3foreach;

public class E01ForEachDemo {
	
	//Exercise 1: After running the program, add another score and name to the arrays
	//and run it again.
	public static void main(String[] args) {
		int[] highScores = { 10, 9, 8, 8, 11};
		String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Jacob"};
		// for each loop with an int array
		for (int value : highScores) {//"for each integer vaule in the highscore array..."
			System.out.println( value );
		}
		for (int i = 0; i < highScores.length; i++) { //this does the same thing as the lop above it, just written in a more traditional sense
			System.out.println(highScores[i]);
		}
		// for each loop with a String array
		for (String value : names) {
			System.out.println(value); // this time it's a name!
		}
	}
}

