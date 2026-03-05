package se.lexicon;

import java.util.Scanner;

public class ConverterApp {
    static void main() {
        Scanner myScanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Converter App ===");
            System.out.println("1. Currency Converter 1");
            System.out.println("2. Temperature Converter 2");
            System.out.println("3. Length Converter 3");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            choice = myScanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Starting Currency Converter....");
                    break;
                case 2:
                    System.out.println("Starting Temperature Converter....");
                    break;
                case 3:
                    System.out.println("Starting Length Converter....");
                    break;
                case 0:
                    System.out.println("Exiting....Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. please try again!!");
            }
            System.out.println();

        } while (choice != 0);
        myScanner.close();
    }

}
