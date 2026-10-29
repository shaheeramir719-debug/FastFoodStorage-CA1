package fastfood;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FoodStack storage = new FoodStack();
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n--- FAST FOOD STORAGE ---");
            System.out.println("1. Add food");
            System.out.println("2. Remove food");
            System.out.println("3. Display all food");
            System.out.println("4. Peek at top food");
            System.out.println("5. Search for food");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
                continue;
            }

            if (choice == 1) {
                if (storage.top == 7) {
                    System.out.println("Storage is full!");
                    continue;
                }
                
              // Display the menu so the user can choose an operation.
              // the menu repeats until the user enters 0 to exit.  
                
                System.out.print("Food name (Burger, Pizza, Fries, Sandwich, Hotdog): ");
                String name = input.nextLine().trim();
                if (!name.equalsIgnoreCase("Burger") &&
                    !name.equalsIgnoreCase("Pizza") &&
                    !name.equalsIgnoreCase("Fries") &&
                    !name.equalsIgnoreCase("Sandwich") &&
                    !name.equalsIgnoreCase("Hotdog")) {
                    System.out.println("Invalid food name!");
                    continue;
                }

                int weight;
                try {
                    System.out.print("Weight in grams: ");
                    weight = Integer.parseInt(input.nextLine());
                    if (weight <= 0) {
                        System.out.println("Weight must be greater than zero!");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Weight must be a whole number!");
                    continue;
                }

                try {
                    System.out.print("Best-before date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(input.nextLine());
                    LocalDate today = LocalDate.now();
                    if (date.isBefore(today) || date.isAfter(today.plusDays(14))) {
                        System.out.println("Date must be today or within 14 days!");
                        continue;
                    }
                    Food food = new Food(name, weight, date);
                    storage.add(food);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date! Use YYYY-MM-DD.");
                }
            } else if (choice == 2) {
                storage.remove();
            } else if (choice == 3) {
                storage.display();
            } else if (choice == 4) {
                storage.peek();
            } else if (choice == 5) {
                System.out.print("Enter food name: ");
                storage.search(input.nextLine().trim());
            } else if (choice == 0) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid menu choice!");
            }
        }
        input.close();
    }
}
