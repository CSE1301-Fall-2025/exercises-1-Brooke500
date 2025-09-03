package module1._8practice;

public class E13TripDistance {
	//Exercise 13: Write a program to calculate the number of miles 
	//you can drive if you have a 10 gallon gas tank and are 
	//down to a quarter of a tank of gas and your car gets 32 
	//miles per gallon.
    public static void main(String[] args) {
        double numGallons = 10.00 / 4.00;
        int milesPerGallon = 32;
        double miles = milesPerGallon * numGallons;
        System.out.println(" I can go " + miles + " miles on a quarter of a 10 gallon tank.");

       // Your code should use the variables
       // numGallons, milesPerGallon, and miles
       // and print out miles
    }
}
