/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Builder;

/**
 *
 * @author user
 */
public class BuilderPatternDemo {
   public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        InteractiveMealBuilder interactiveMealBuilder = new InteractiveMealBuilder(mealBuilder);
        Meal meal = interactiveMealBuilder.createInteractiveMeal();

        System.out.println("Your Customized Meal");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
}
