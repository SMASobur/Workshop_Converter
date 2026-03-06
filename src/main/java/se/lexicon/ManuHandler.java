package se.lexicon;

import java.util.Scanner;

class MenuHandler {
    private Scanner scanner;

    public MenuHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMainMenu() {
        System.out.println("\n=== Converter App ===");
        System.out.println("1. Currency Converter");
        System.out.println("2. Temperature Converter");
        System.out.println("3. Length Converter");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    public int getUserChoice() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }

    public void pressEnterToContinue() {
        System.out.print("Press Enter to continue...");
        scanner.nextLine();
    }
}