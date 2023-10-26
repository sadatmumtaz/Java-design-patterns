/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Builder;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class InteractiveMealBuilder {
    private MealBuilder mealBuilder;

    public InteractiveMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal createInteractiveMeal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Meal Customization System");
        System.out.print("Enter '1' for Vegetarian Meal or '2' for Non-Vegetarian Meal: ");
        int choice = scanner.nextInt();
        Meal meal;
        if (choice == 1) {
            meal = mealBuilder.prepareVegMeal();
        } else if (choice == 2) {
            meal = mealBuilder.prepareNonVegMeal();
        } else {
            System.out.println("Invalid choice. Defaulting to Vegetarian Meal.");
            meal = mealBuilder.prepareVegMeal();
        }

        System.out.println("Customize your meal:");
        customizeTea(scanner, meal);
        return meal;
    }

    private void customizeTea(Scanner scanner, Meal meal) {
        System.out.println("Customize your Tea (optional):");
        System.out.print("Enter sweetness type (e.g., Regular, Sweet, Unsweetened): ");
        String sweetnessType = scanner.next();
        System.out.print("Add cream (yes/no): ");
        boolean cream = scanner.next().equalsIgnoreCase("yes");
        System.out.print("Enter sweetness amount in spoons (0 for none): ");
        int sweetnessAmount = scanner.nextInt();

        if (sweetnessAmount < 0) {
            sweetnessAmount = 0;
        }

        Tea tea = new Tea();
        tea.setSweetnessType(sweetnessType);
        tea.setCream(cream);
        tea.setSweetnessAmount(sweetnessAmount);
        meal.addItem(tea);
    }
}
