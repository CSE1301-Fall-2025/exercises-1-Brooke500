package module2._01ifs;

import java.util.Scanner;
public class E04PizzaCalculatorInput {

	//Exercise 4: Add a check to this program that skips
	//the computations if the number of people is less than
	//or equal to zero
    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many pizza slices do you have");

        pizzaSlices = scan.nextInt();

        System.out.println("How many people are there?");

        numPeople = scan.nextInt();

        if (!(numPeople > 0)) {
            System.out.println("Sorry, I can't divide by that number!");
        }
        
        if (numPeople > 0) {
        slicesPerPerson = pizzaSlices / numPeople;
        leftoverSlices = pizzaSlices % numPeople;

        System.out.println("Each person can have this many slices!:");

        System.out.println(slicesPerPerson);

        System.out.println("And there will be this many peieces left!:");

        System.out.println(leftoverSlices);
        }
    }

}
