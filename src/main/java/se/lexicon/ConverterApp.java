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
        System.out.println("**** Currency Converter ****");



    }

    public static void temperatureConverter(){
        System.out.println("**** Temperature Converter ****");
        System.out.println("What would you like to convert?");
        System.out.println("a. Celsius to Fahrenheit");
        System.out.println("b. Fahrenheit to Celsius");

        String subChoice = myScanner.nextLine().toLowerCase();

        if (subChoice.equals("a")){
            System.out.print("Enter Celsius: ");
            double celsius = Double.parseDouble(myScanner.nextLine());
            double fahrenheit = (celsius* 9/5)+32;
            System.out.printf("%.2f°C = %.2f°F", celsius, fahrenheit);
        } else if (subChoice.equals("b")) {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = Double.parseDouble(myScanner.nextLine());
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid choice!!!");
        }
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
