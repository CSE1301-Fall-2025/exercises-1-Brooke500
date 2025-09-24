package module3._4twodimensional;

public class E02TwoDArraySet {
	//Exercise 2: What will this print? Write down your answer before
	//running the code to check. Can you add another row to each array?
	public static void main(String[] args) {
		// declare arrays
		int[][] ticketInfo;
		String[][] seatingChart;

		// create arrays
		ticketInfo = new int [2][4];
		seatingChart =  new String [3][3];

		// initialize the array elements
		ticketInfo[0][0] = 15;
		ticketInfo[0][1] = 10;
		ticketInfo[0][2] = 15;
		ticketInfo[1][0] = 25;
		ticketInfo[1][1] = 20;
		ticketInfo[1][2] = 25;
		ticketInfo[1][3] = 15;
		seatingChart[0][0] = "Jamal";
		seatingChart[0][1] = "Maria";
		seatingChart[1][0] = "Jacob";
		seatingChart[1][1] = "Suzy";
		seatingChart[2][0] = "Emma";
		seatingChart[2][1] = "Luke";
		seatingChart[2][2] = "Roslyn";

		// print the contents
		System.out.println(ticketInfo [1][3]);
		System.out.println(seatingChart [2][2]);
	}
}

