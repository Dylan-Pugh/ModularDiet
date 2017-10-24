/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulardiet;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author dpugh
 */
public class Person {

    protected double height,
            weight,
            bodyFat;
    protected String name;
    protected LocalDate birthday;
    protected char sex;
    protected UUID ID;
    //to-do - add recipeBook parameter

    /**
     * Default constructor
     */
    public Person() {
    }

    /**
     *
     * @param height
     * @param weight
     * @param name
     * @param birthday
     * @param sex
     */
    public Person(double height, double weight, String name, LocalDate birthday,
            char sex) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        //generates a unique ID number
        ID = UUID.randomUUID();
    }

    /**
     *
     * @return
     */
    public UUID getID() {
        return ID;
    }

    /**
     *
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @return
     */
    public double getBodyFat() {
        return bodyFat;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     *
     * @return
     */
    public char getSex() {
        return sex;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        LocalDate current = LocalDate.now();
        long daysAlive = current.toEpochDay() - birthday.toEpochDay();
        return (int) (daysAlive / 365);

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
        StringBuilder str = new StringBuilder();

        str.append("ID: ").append(ID).append("\n");
        str.append("Name: ").append(name).append("\n");
        str.append("Birthday: ").append(birthday).append("\n");
        str.append("Age: ").append(getAge()).append("\n");
        str.append("Sex: ").append(sex).append("\n");
        str.append("Height: ").append(height).append("\n");
        str.append("Weight: ").append(weight).append("\n");

        return str.toString();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate jDay = LocalDate.of(1990, 8, 28);
        Person josh = new Person(81, 374, "Josh Acker", jDay, 'm');

        System.out.println(josh.toString());
    }

}
