/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulardiet;

import java.time.LocalDate;

/**
 *
 * @author dpugh
 */
public class Trainee extends Person {

    protected double height,
            weight,
            bodyFat;
    protected Diet diet;
    protected RecipeBook recipes;

    public Trainee(double height, double weight, double bodyFat, Diet diet,
            RecipeBook recipes, String name, LocalDate birthday, char sex) {
        super(name, birthday, sex);
        this.height = height;
        this.weight = weight;
        this.bodyFat = bodyFat;
        this.diet = diet;
        this.recipes = recipes;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param newWeight
     */
    public void updateWeight(double newWeight) {
        weight = newWeight;
    }

    /**
     *
     * @param newFat
     */
    public void updateBodyFat(double newFat) {
        bodyFat = newFat;

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.append("Height: ").append(height).append("\n");
        str.append("Weight: ").append(weight).append("\n");

        return str.toString();
    }

}
