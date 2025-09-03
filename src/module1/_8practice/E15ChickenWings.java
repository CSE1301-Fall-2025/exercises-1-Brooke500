package module1._8practice;

public class E15ChickenWings {
	//Exercise 15: Write a program to compute the number of
	//chicken wings you can buy if you have $4.50 and they
	//cost $0.75 each. Remember that you can't buy part of a wing.
    public static void main(String[] args) {
      double money = 4.50;
      double pricePerWing = 0.75;
      double numWings = money / pricePerWing;

      System.out.println("If you have $4.50 and each wing costs $0.75, you can buy " + numWings + " wings.");

      // Your code should use the variables
      // money, pricePerWing, numWings
      // and print out numWings

    }
}
