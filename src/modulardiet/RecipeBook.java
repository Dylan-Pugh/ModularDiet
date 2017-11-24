/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulardiet;

import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author dpugh
 */
public class RecipeBook {

    protected HashMap<UUID, Food> recipes = new HashMap<>();

    public RecipeBook() {
    }

    public void add(Food toAdd, UUID key) {
        recipes.put(key, toAdd);

    }

    public boolean remove(UUID key) {
        boolean removed = false;

        if (recipes.containsKey(key)) {
            recipes.remove(key);
            removed = true;
        }

        return removed;

    }

    @Override
    public String toString() {
        StringBuilder str  = new StringBuilder();
        for (UUID currentKey : recipes.keySet()){
            str.append(recipes.get(currentKey).getName());
        }
        
        return str.toString();
    }
    
    

}
