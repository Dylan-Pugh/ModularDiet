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
public class Trainee extends Person{

    protected double height,
            weight,
            bodyFat;

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
