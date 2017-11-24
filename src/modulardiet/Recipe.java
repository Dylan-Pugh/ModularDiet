/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulardiet;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author dpugh
 */
public class Recipe extends Food {

    protected ArrayList<Food> ingredients = new ArrayList<>();

    public Recipe(String name, double calories, double protein, double carbs, double fat,
            double servingSize, String category, boolean isVegan,
            boolean isVegetarian, boolean isGlutenFree) {

        super(name, calories, protein, carbs, fat, servingSize, category, isVegan,
                isVegetarian, isGlutenFree);
    }

    public void addFood(Food toAdd) {
        ingredients.add(toAdd);
        
        this.calories += toAdd.calories;
            this.protein += toAdd.protein;
            this.carbs += toAdd.carbs;
            this.fat += toAdd.fat;

            if (!toAdd.isVegan) {
                this.isVegan = false;
            }

            if (!toAdd.isVegetarian) {
                this.isVegetarian = false;
            }

            if (!toAdd.isGlutenFree) {
                this.isGlutenFree = false;
            }

    }

    public boolean removeFood(UUID target) {
        boolean removed = false;
        for (Food current : ingredients) {
            if (current.getID().equals(target)) {
                removed = ingredients.remove(current);
                return removed;
            }
        }
        return removed;
    }

    public void calcMacros() {
        for (Food current : ingredients) {
            this.calories += current.calories;
            this.protein += current.protein;
            this.carbs += current.carbs;
            this.fat += current.fat;

            if (!current.isVegan) {
                this.isVegan = false;
            }

            if (!current.isVegetarian) {
                this.isVegetarian = false;
            }

            if (!current.isGlutenFree) {
                this.isGlutenFree = false;
            }

        }
    }

}
