package module2._10exercises;

public class E06Fever {
	//Exercise 6: Complete the code below to print "you have a fever"
	//if the temp is above 100 and "you don't have a fever" otherwise.
    public static void main(String[] args) {
        double temp = 92;
        
        if (temp > 100) {
            System.out.println("You have a fever.");
        }
        else {
            System.out.print("You don't have a fever.");
        }
    }
}
