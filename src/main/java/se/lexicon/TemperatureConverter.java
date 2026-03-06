package se.lexicon;

import java.util.Scanner;

class TemperatureConverter {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        displayMenu();
        String choice = getUserChoice();
        processConversion(choice);
    }

    private void displayMenu() {
        System.out.println("\n**** Temperature Converter ****");
        System.out.println("a. Celsius to Fahrenheit");
        System.out.println("b. Fahrenheit to Celsius");
        System.out.print("Choose (a/b): ");
    }

    private String getUserChoice() {
        return scanner.nextLine().toLowerCase();
    }

    private void processConversion(String choice) {
        if (choice.equals("a")) {
            convertCelsiusToFahrenheit();
        } else if (choice.equals("b")) {
            convertFahrenheitToCelsius();
        } else {
            System.out.println("Invalid choice!!!");
        }
    }

    private void convertCelsiusToFahrenheit() {
        System.out.print("Enter Celsius: ");
        double celsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
    }

    private void convertFahrenheitToCelsius() {
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
    }
}