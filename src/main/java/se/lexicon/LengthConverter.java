package se.lexicon;

import java.util.Scanner;

class LengthConverter {
    private Scanner scanner = new Scanner(System.in);
    private static final double METER_TO_FEET = 3.28084;
    private static final double KM_TO_MILES = 0.621371;

    public void run() {
        displayMenu();
        int choice = Integer.parseInt(scanner.nextLine());
        processConversion(choice);
    }

    private void displayMenu() {
        System.out.println("\n**** Length Converter ****");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Feet to Meters");
        System.out.println("3. Kilometers to Miles");
        System.out.println("4. Miles to Kilometers");
        System.out.print("Choose (1-4): ");
    }

    private void processConversion(int choice) {
        switch (choice) {
            case 1:
                convertMetersToFeet();
                break;
            case 2:
                convertFeetToMeters();
                break;
            case 3:
                convertKmToMiles();
                break;
            case 4:
                convertMilesToKm();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private void convertMetersToFeet() {
        System.out.print("Enter meters: ");
        double meters = Double.parseDouble(scanner.nextLine());
        double feet = meters * METER_TO_FEET;
        System.out.printf("Result: %.2f meters = %.2f feet%n", meters, feet);
    }

    private void convertFeetToMeters() {
        System.out.print("Enter feet: ");
        double feet = Double.parseDouble(scanner.nextLine());
        double meters = feet / METER_TO_FEET;
        System.out.printf("Result: %.2f feet = %.2f meters%n", feet, meters);
    }

    private void convertKmToMiles() {
        System.out.print("Enter kilometers: ");
        double km = Double.parseDouble(scanner.nextLine());
        double miles = km * KM_TO_MILES;
        System.out.printf("Result: %.2f km = %.2f miles%n", km, miles);
    }

    private void convertMilesToKm() {
        System.out.print("Enter miles: ");
        double miles = Double.parseDouble(scanner.nextLine());
        double km = miles / KM_TO_MILES;
        System.out.printf("Result: %.2f miles = %.2f km%n", miles, km);
    }
}