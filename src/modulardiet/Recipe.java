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

    protected ArrayList ingredients = new ArrayList<Food>();

    public Recipe(String name, double calories, double protein, double carbs, double fat,
            double servingSize, String category, boolean isVegan,
            boolean isVegetarian, boolean isGlutenFree) {

        super(name, calories, protein, carbs, fat, servingSize, category, isVegan,
                isVegetarian, isGlutenFree);
    }

    public void addFood(Food toAdd) {
        ingredients.add(toAdd);

    }

    public boolean removeFood(UUID target) {
        boolean removed = false;
        for (Object current : ingredients) {
            Food test = (Food) current;
            if (test.getID().equals(target)) {
                removed = ingredients.remove(current);
            }
        }
        return removed;
    }

}
