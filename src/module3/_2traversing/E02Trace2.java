package module3._2traversing;

public class E02Trace2 {

	//Exercise 2: Trace the execution of the following code,
	//then run it to see if you were correct
	public static void main(String[] args) {
		String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia", "Ros", "Mea"};

		int index = 1;
		System.out.println(names[index - 1]);
		index++;
		System.out.println(names[index]);
		System.out.println(names[index/2]);
		names[index] = "Rafi";
		index--;
		System.out.println(names[index+1]);
	}
}

