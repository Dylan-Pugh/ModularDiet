/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulardiet;

/**
 *
 * @author dpugh
 */
public class ModularDiet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Diet joshDiet = new Diet(2000.0, 30.0, 50.0, 20.0);
        
        System.out.println(joshDiet.toString());
        
        Food carrot = new Food("Carrot", 30, 3, 20, 0, 1, "Vegetable", true, true, true);
        Food apple = new Food("Apple", 70, 7, 60, 0, 1, "Fruit", true, true, true);
        
        System.out.println(carrot.toString());
        System.out.println(apple.toString());
        
        Recipe fruitSalad = new Recipe("Fruit Salad", 0, 0, 0, 0, 0, "Side Dishes", true, true, true);
        
        System.out.println("Testing recipe, inital state: \n");
        
        System.out.println(fruitSalad.toString());
        System.out.println("After adding carrots: ");
        fruitSalad.addFood(carrot);
        
        System.out.println(fruitSalad.toString());
        fruitSalad.addFood(apple);
        System.out.println("After adding apples: ");
        
        System.out.println(fruitSalad.toString());
        
        joshDiet.updateTotals(fruitSalad);
        
        System.out.println(joshDiet.toString());
    }
    
}
