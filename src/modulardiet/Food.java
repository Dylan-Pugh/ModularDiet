/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulardiet;

import java.util.UUID;

/**
 *
 * @author dpugh
 */
public class Food {

    protected UUID ID;
    protected String name;
    protected double calories,
            protein,
            carbs,
            fat,
            servingSize;
    protected String category;
    protected boolean isVegan,
            isVegetarian,
            isGlutenFree;

    public Food(String name, double calories, double protein, double carbs, double fat,
            double servingSize, String category, boolean isVegan,
            boolean isVegetarian, boolean isGlutenFree) {
        ID = UUID.randomUUID();
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        this.servingSize = servingSize;
        this.category = category;
        this.isVegan = isVegan;
        this.isVegetarian = isVegetarian;
        this.isGlutenFree = isGlutenFree;
    }

    public UUID getID() {
        return ID;
    }
    
    

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFat() {
        return fat;
    }

    public double getServingSize() {
        return servingSize;
    }

    public String getCategory() {
        return category;
    }
    
    public void updateServings(double newSize){
        servingSize = newSize;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("ID: ").append(ID).append("\n");
        str.append("Name: ").append(name).append("\n");
        str.append("Calories: ").append(calories).append("\n");
        str.append("Protein: ").append(protein).append("\n");
        str.append("Carbs: ").append(carbs).append("\n");
        str.append("Fat: ").append(fat).append("\n");
        str.append("Serving Size: ").append(servingSize).append("\n");
        str.append("Category: ").append(category).append("\n");
        str.append("Vegan?: ").append(isVegan).append("\n");
        str.append("Vegetarian?: ").append(isVegetarian).append("\n");
        str.append("Gluten Free?: ").append(isGlutenFree).append("\n");

        return str.toString();
    }
    
    

}
