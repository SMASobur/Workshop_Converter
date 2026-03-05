package se.lexicon;

import java.util.Scanner;

public class ConverterApp {

    private static Scanner myScanner = new Scanner(System.in);
    static void main() {

        int choice;

        do {
            displayMenu();
            choice = getUserChoice();

            switch (choice){
                case 1:
                    currencyConverter();
                    break;
                case 2:
                    temperatureConverter();
                    break;
                case 3:
                    lengthConverter();
                    break;
                case 0:
                    System.out.println("Exiting....Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1-3");
            }
            System.out.println();

        } while (choice != 0);

    }
    public static int getUserChoice() {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                choice = Integer.parseInt(myScanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number (1-3): ");
            }
        }

        return choice;
    }

    public static void displayMenu(){
        System.out.println("=== Converter App ===");
        System.out.println("1. Currency Converter 1");
        System.out.println("2. Temperature Converter 2");
        System.out.println("3. Length Converter 3");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    public static void currencyConverter(){
        System.out.println("Starting Currency Converter....");
    }

    public static void temperatureConverter(){
        System.out.println("Starting Temperature Converter....");
    }

    public static void lengthConverter(){
        System.out.println("Starting Length Converter....");
    }

}
