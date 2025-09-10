package module2._10exercises;

public class E19CountX {
	//Exercise 19: Complete the code below to count the number of
	//"x"s in the String. Use indexOf() with a loop.
    public static void main(String[] args) {
        String message = "xyxxzax";
        int index = 0;
        int count = 0;

        while (message.indexOf("x") >= 0 && index <= message.length()) {

            index = message.indexOf("x");
            String keepCount = message.substring(0,index);
            String keepCountTwo = message.substring(index+1);
            message = keepCount+keepCountTwo;

            count++;
        }
        System.out.println("This is the amount of times 'x' appears in this work: " + count);

    }
}
