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
                    System.out.println("Invalid option. Please choose 1-3 or 0->Exit");
                    myScanner.nextLine();
            }
            // Add spacing for better readability
            if (choice != 0) {
                System.out.println();
                pressEnterToContinue();
            }

        } while (choice != 0);

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

    // Press enter to continue
    public static void pressEnterToContinue() {
        System.out.print("Press Enter to continue...");
        myScanner.nextLine();
    }


    // User input validation.
    public static int getUserChoice() {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                choice = Integer.parseInt(myScanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number (1-3, 0->Exit): ");
            }
        }
        return choice;
    }

    //Display the manu option.
    public static void displayMenu(){
        System.out.println("=== Converter App ===");
        System.out.println("1. Currency Converter 1");
        System.out.println("2. Temperature Converter 2");
        System.out.println("3. Length Converter 3");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

}
