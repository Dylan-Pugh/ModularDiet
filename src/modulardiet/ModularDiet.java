/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulardiet;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author dpugh
 */
public class ModularDiet {

    protected static HashMap<UUID, Trainee> trainees = new HashMap<>();
    static Scanner stdIn = new Scanner(System.in);

    public static int getMenuChoice(Scanner scan) {

        int choice;
        do {
            System.out.print("*************************\n"
                    + "* 1. Select Trainee        *\n"
                    + "* 2. Create New Trainee    *\n"
                    + "* 3. Quit                  *\n"
                    + "*************************\n"
                    + "  Enter Choice --> ");
            choice = scan.nextInt();
        } while (choice < 1 || choice > 4);

        return choice;
    }

    public static void addTrainee(Scanner scan) {

        String name;
        LocalDate birthday;
        char sex;
        double height,
                weight,
                bodyFat;
        RecipeBook recipes = new RecipeBook();

        System.out.println("Please enter name: ");
        name = scan.nextLine();
        System.out.println(name);

        System.out.println("Please enter birthday year in format YYYY: ");
        int year = scan.nextInt();
        System.out.println("Please enter birthday month in format MM: ");
        int month = scan.nextInt();
        System.out.println("Please enter birthday day in format DD: ");
        int day = scan.nextInt();

        //save for initialization statement
        birthday = LocalDate.of(year, month, day);

        System.out.println("Please enter sex (m/f): ");
        sex = scan.next().charAt(0);
        System.out.println("Please enter height in inches: ");
        height = scan.nextDouble();
        System.out.println("Please enter weight in pounds: ");
        weight = scan.nextDouble();
        System.out.println("Please enter bodyfat percentage: ");
        bodyFat = scan.nextDouble();

        System.out.println("Please enter total daily calories: ");
        double cal = scan.nextDouble();
        System.out.println("Please enter protein as target percent: ");
        double protein = scan.nextDouble();
        System.out.println("Please enter carbs as target percent: ");
        double carbs = scan.nextDouble();
        System.out.println("Please enter fat as target percent: ");
        double fat = scan.nextDouble();

        Diet diet = new Diet(cal, protein, carbs, fat);

        Trainee toAdd = new Trainee(height, weight, bodyFat, diet, recipes, name,
                birthday, sex);

        trainees.put(toAdd.getID(), toAdd);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean finished = false;

        while (!finished) {
            int choice = getMenuChoice(stdIn);
            switch (choice) {
                case 1:
                    System.out.println("Not Yet Implemented");
                    break;
                case 2:
                    addTrainee(stdIn);
                    break;
                case 3:
                    finished = true;

            }
        }//end while 
        
        System.out.println("Testing addTrainee: ");
        
        StringBuilder str  = new StringBuilder();
        for (UUID currentKey : trainees.keySet()){
            str.append(trainees.get(currentKey).toString());
            str.append(trainees.get(currentKey).diet.toString());
        }
        
        System.out.println(str.toString());

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

        RecipeBook myBook = new RecipeBook();

        myBook.add(fruitSalad, fruitSalad.getID());

        System.out.println(myBook.toString());

    }

}
