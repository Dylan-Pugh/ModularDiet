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
public class Diet {

    protected double totalCal,
            totalProtein, // totals in grams
            totalCarb,
            totalFat,
            remainingCal,
            remainingProtein,
            remainingCarb,
            remainingFat;

    public Diet(double totalCal, int totalProtein, int totalCarb, int totalFat) {
        this.totalCal = totalCal;
        this.totalProtein = totalProtein;
        this.totalCarb = totalCarb;
        this.totalFat = totalFat;
        this.remainingCal = totalCal;
        this.remainingProtein = totalProtein;
        this.remainingCarb = totalCarb;
        this.remainingFat = totalFat;
    }

    public Diet(double cal, double proteinPercent, double carbPercent, double fatPercent) {
        totalCal = cal;
        totalProtein = ((proteinPercent / 100) * totalCal) / 4;
        totalCarb = ((carbPercent / 100) * totalCal) / 4;
        totalFat = ((fatPercent / 100) * totalCal) / 8;
        this.remainingCal = totalCal;
        this.remainingProtein = totalProtein;
        this.remainingCarb = totalCarb;
        this.remainingFat = totalFat;
    }

    public double getRemainingCal() {
        return remainingCal;
    }

    public double getRemainingProtein() {
        return remainingProtein;
    }

    public double getRemainingCarb() {
        return remainingCarb;
    }

    public double getRemainingFat() {
        return remainingFat;
    }

    //should this check to see if the addedFood will exceed totals?
    public boolean updateTotals(Food addedFood) {
        remainingCal = (totalCal - addedFood.getCalories());
        remainingProtein = (totalProtein - addedFood.getProtein());
        remainingCarb = (totalCarb - addedFood.getCarbs());
        remainingFat = (totalFat - addedFood.getFat());

        if (remainingCal > 0 && remainingProtein > 0 && remainingCarb > 0 && remainingFat > 0) {
            return true;
        } else {

            return false;
        }
    }


    public boolean reset() {
        remainingCal = totalCal;
        remainingProtein = totalProtein;
        remainingCarb = totalCarb;
        remainingFat = totalFat;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        
        str.append("Diet Report:  \n");
        str.append("Total Calories: ").append(totalCal).append("\n");
        str.append("Total Protein: ").append(totalProtein).append("\n");
        str.append("Total Carbs: ").append(totalCarb).append("\n");
        str.append("Total Fat: ").append(totalFat).append("\n");
        str.append("\nRemaining Values: \n");
        str.append("Remaining Calories: ").append(remainingCal).append("\n");
        str.append("Remaining Protein: ").append(remainingProtein).append("\n");
        str.append("Remaining Carbs: ").append(remainingCarb).append("\n");
        str.append("Remaining Fat: ").append(remainingFat).append("\n");
        
        
        return str.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
