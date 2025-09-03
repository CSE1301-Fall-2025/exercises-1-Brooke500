package module1._8practice;

public class E08MilesPerGallon1 {
	//Exercise 8: This code is attempting to compute the miles per
	//gallon of a recent car trip but there are errors. Fix them!
	public static void main(String[] args) {
		int tripMiles = 300;
		double price = 2.50;
		int milesPerGallon = 30;
		double numberOfGallons = tripMiles / milesPerGallon;
		double totalCost = numberOfGallons * price;
		System.out.println("$" + totalCost);
	}
}
