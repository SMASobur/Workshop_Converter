package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    //Currency converter
    public static void currencyConverter(){
        System.out.println("**** Currency Converter ****");
        System.out.println("What would you like to convert?");
        System.out.println("1. SEK to BDT");
        System.out.println("2. BDT to SEK");
        System.out.println("3. GBP to EUR");
        System.out.println("4. EUR to GBP");
        System.out.print("Choose (1-4): ");

        int choice = Integer.parseInt(myScanner.nextLine());

        final double SEK_TO_BDT = 13.05;
        final double GBP_TO_EUR = 1.16;

        switch (choice){
            case 1:
                System.out.print("Enter SEK amount: ");
                double sek = Double.parseDouble(myScanner.nextLine());
                double bdt = sek * SEK_TO_BDT;
                System.out.printf("Result: SEK %.2f = BDT %.2f%n", sek, bdt);
                convertedAt();
                break;
            case 2:
                System.out.print("Enter BDT amount: ");
                sek = Double.parseDouble(myScanner.nextLine());
                bdt = sek / SEK_TO_BDT;
                System.out.printf("Result: BDT %.2f = SEK %.2f%n", sek, bdt);
                convertedAt();
                break;
            case 3:
                System.out.print("Enter GBP amount: ");
                double gbp = Double.parseDouble(myScanner.nextLine());
                double eur = gbp * GBP_TO_EUR;
                System.out.printf("Result: GBP %.2f = EUR %.2f%n", gbp, eur);
                convertedAt();
                break;
            case 4:
                System.out.print("Enter EUR amount: ");
                gbp = Double.parseDouble(myScanner.nextLine());
                eur = gbp / GBP_TO_EUR;
                System.out.printf("Result: EUR %.2f = GBP %.2f%n", gbp, eur);
                convertedAt();
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }

    //Converted time and date
    public static void convertedAt(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Converted at: "+ dateTime.format((formatter)));
    }

    //Temperature converter
    public static void temperatureConverter(){
        System.out.println("**** Temperature Converter ****");
        System.out.println("What would you like to convert?");
        System.out.println("a. Celsius to Fahrenheit");
        System.out.println("b. Fahrenheit to Celsius");
        System.out.print("Choose (a/b): ");

        String subChoice = myScanner.nextLine().toLowerCase();

        if (subChoice.equals("a")){
            System.out.print("Enter Celsius: ");
            double celsius = Double.parseDouble(myScanner.nextLine());
            double fahrenheit = (celsius* 9/5)+32;
            System.out.printf("%.2f°C = %.2f°F", celsius, fahrenheit);
        } else if (subChoice.equals("b")) {
            System.out.print("Enter Fahrenheit: ");
            double fahrenheit = Double.parseDouble(myScanner.nextLine());
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid choice!!!");
        }
    }

    //Length converter
    public static void lengthConverter(){
        System.out.println("**** Length Converter ****");
        System.out.println("What would you like to convert?");
        System.out.println("Length Converter");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Feet to Meters");
        System.out.println("3. Kilometers to Miles");
        System.out.println("4. Miles to Kilometers");
        System.out.print("Choose (1-4): ");

        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice){
            case 1:
                System.out.print("Enter meters: ");
                double meter = Double.parseDouble(myScanner.nextLine());
                double feet = meter*3.28084;
                System.out.printf("Result: %.2f meters = %.2f feet's%n", meter,feet);
                break;
            case 2:
                System.out.print("Enter feet's: ");
                feet = Double.parseDouble(myScanner.nextLine());
                meter = feet/3.28084;
                System.out.printf("Result: %.2f feet's = %.2f meters%n", meter,feet);
                break;
            case 3:
                System.out.print("Enter kilometers: ");
                double km = Double.parseDouble(myScanner.nextLine());
                double miles = km * 0.621371;
                System.out.printf("Result: %.2f km = %.2f miles%n", km, miles);
                break;
            case 4:
                System.out.print("Enter miles: ");
                miles = Double.parseDouble(myScanner.nextLine());
                km = miles / 0.621371;
                System.out.printf("Result: %.2f miles = %.2f km%n", miles, km);
                break;
            default:
                System.out.println("Invalid choice!");
        }
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
