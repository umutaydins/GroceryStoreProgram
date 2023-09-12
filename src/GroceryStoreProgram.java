import java.util.Scanner;

public class GroceryStoreProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prices per kilogram for fruits
        double applePrice = 3.67;
        double pearPrice = 2.14;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        System.out.print("How many kilograms of apples? : ");
        double appleKilos = scanner.nextDouble();

        System.out.print("How many kilograms of pears? : ");
        double pearKilos = scanner.nextDouble();

        System.out.print("How many kilograms of tomatoes? : ");
        double tomatoKilos = scanner.nextDouble();

        System.out.print("How many kilograms of bananas? : ");
        double bananaKilos = scanner.nextDouble();

        System.out.print("How many kilograms of eggplants? : ");
        double eggplantKilos = scanner.nextDouble();

        scanner.close();

        // Calculate the total cost
        double totalCost = (applePrice * appleKilos) + (pearPrice * pearKilos) +
                (tomatoPrice * tomatoKilos) + (bananaPrice * bananaKilos) +
                (eggplantPrice * eggplantKilos);

        System.out.println("Total Cost : " + totalCost + " TL");
    }
}
