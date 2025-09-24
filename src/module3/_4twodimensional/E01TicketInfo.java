package module3._4twodimensional;

public class E01TicketInfo {
	//Exercise
	public static void main(String[] args) {
		// declare arrays
		int[][] ticketInfo = new int[5][10];
		ticketInfo [3][7]= 15;
		System.out.println(ticketInfo[3][7]);
		System.out.println(ticketInfo.length + " rows");
		System.out.println(ticketInfo[0].length + " columns"); //this is how you access the number of cols for an array
		//bascailly, the length of a row is the same of the number of cols there are
	}
}
