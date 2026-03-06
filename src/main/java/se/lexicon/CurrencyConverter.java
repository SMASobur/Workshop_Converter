package se.lexicon;

import java.util.Scanner;

class CurrencyConverter {
    private Scanner scanner = new Scanner(System.in);
    private static final double SEK_TO_BDT = 13.05;
    private static final double GBP_TO_EUR = 1.16;
    private ConversionLogger logger = new ConversionLogger();

    public void run() {
        displayMenu();
        int choice = getUserChoice();
        processConversion(choice);
    }

    private void displayMenu() {
        System.out.println("\n**** Currency Converter ****");
        System.out.println("1. SEK to BDT");
        System.out.println("2. BDT to SEK");
        System.out.println("3. GBP to EUR");
        System.out.println("4. EUR to GBP");
        System.out.print("Choose (1-4): ");
    }

    private int getUserChoice() {
        return Integer.parseInt(scanner.nextLine());
    }

    private void processConversion(int choice) {
        switch (choice) {
            case 1:
                convertSEKtoBDT();
                break;
            case 2:
                convertBDTtoSEK();
                break;
            case 3:
                convertGBPtoEUR();
                break;
            case 4:
                convertEURtoGBP();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    // Each method does ONE specific conversion
    private void convertSEKtoBDT() {
        System.out.print("Enter SEK amount: ");
        double sek = Double.parseDouble(scanner.nextLine());
        double bdt = sek * SEK_TO_BDT;
        System.out.printf("Result: SEK %.2f = BDT %.2f%n", sek, bdt);
        logger.logConversion();
    }

    private void convertBDTtoSEK() {
        System.out.print("Enter BDT amount: ");
        double bdt = Double.parseDouble(scanner.nextLine());
        double sek = bdt / SEK_TO_BDT;
        System.out.printf("Result: BDT %.2f = SEK %.2f%n", bdt, sek);
        logger.logConversion();
    }

    private void convertGBPtoEUR() {
        System.out.print("Enter GBP amount: ");
        double gbp = Double.parseDouble(scanner.nextLine());
        double eur = gbp * GBP_TO_EUR;
        System.out.printf("Result: GBP %.2f = EUR %.2f%n", gbp, eur);
        logger.logConversion();
    }

    private void convertEURtoGBP() {
        System.out.print("Enter EUR amount: ");
        double eur = Double.parseDouble(scanner.nextLine());
        double gbp = eur / GBP_TO_EUR;
        System.out.printf("Result: EUR %.2f = GBP %.2f%n", eur, gbp);
        logger.logConversion();
    }
}