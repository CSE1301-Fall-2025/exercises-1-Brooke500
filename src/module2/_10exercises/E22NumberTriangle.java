package module2._10exercises;

public class E22NumberTriangle {
	//Exercise 22: Complete the program below to print:
	
	//55555
	//4444
	//333
	//22
	//1
	
	//Use loops to accomplish this!
    public static void main(String[] args) {
		int num = 5;
		while (num >0) {
			for (int col = 1; col<=num; col++) {
				System.out.print(num);
			}
			num--;
			System.out.println();
		}
    }
}
