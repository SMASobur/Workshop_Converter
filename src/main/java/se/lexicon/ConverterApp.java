package se.lexicon;

import java.util.Scanner;

public class ConverterApp {

    private static Scanner scanner = new Scanner(System.in);

    private static MenuHandler menuHandler = new MenuHandler(scanner);
    private static CurrencyConverter currencyConverter = new CurrencyConverter();
    private static TemperatureConverter temperatureConverter = new TemperatureConverter();
    private static LengthConverter lengthConverter = new LengthConverter();

    static void main() {

        int choice;

        do {
            menuHandler.displayMainMenu();
            choice = menuHandler.getUserChoice();

            switch (choice){
                case 1:
                    currencyConverter.run();
                    break;
                case 2:
                    temperatureConverter.run();
                    break;
                case 3:
                    lengthConverter.run();
                    break;
                case 0:
                    System.out.println("Exiting....Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1-3 or 0->Exit");
                    scanner.nextLine();
            }
            // Add spacing for better readability
            if (choice != 0) {
                System.out.println();
                //pressEnterToContinue();
            }

        } while (choice != 0);

    }

}
