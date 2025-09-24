package module3._1basics;

public class E03ArrayAccess {
	
	//Exercise 3: Can you print out 3rd score in the array (remember 
	//that the first score is at index 0)? Can you change last 
	//score to 97 using an assignment statement in the code? 
	//Can you change the array so that it has 6 elements and 
	//add another score and print it out? What happens if you 
	//try to access an element that is not there, for example 
	//at index 7?
	public static void main(String[] args) {
		// declare and create arrays
		int[ ] highScores = new int[5];
		// Print initial highScore
		System.out.println(highScores[0]); //"go look at bucket [0]! Take the vaule from there! There's nothing there yet, so I'll print out 0"
		// put values in highScore using an indexed variable
		highScores[0] = 99;
		highScores[1] = 98;
		highScores[2] = 98;
		highScores[3] = 88;
		highScores[4] = 68;

		// Print first highScore at index 0
		System.out.println( highScores[3] );

		//vaules are the actual amount that is assigned to the bucket, and the index is which bucket it is. They both start at 0.

	}
}

