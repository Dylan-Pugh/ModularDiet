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
            totalFat;

    public Diet(double cal, int proteinPercent, int carbPercent, int fatPercent) {
        totalCal = cal;
        totalProtein = ((proteinPercent / 100) * totalCal) / 4;
        totalCarb = ((carbPercent / 100) * totalCal) / 4;
        totalFat = ((fatPercent / 100) * totalCal) / 8;
    }

}
