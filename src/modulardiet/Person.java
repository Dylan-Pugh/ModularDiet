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

    protected String name;
    protected LocalDate birthday;
    protected char sex;
    protected UUID ID;

    /**
     *
     * @param name
     * @param birthday
     * @param sex
     */
    public Person(String name, LocalDate birthday, char sex) {

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

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("ID: ").append(ID).append("\n");
        str.append("Name: ").append(name).append("\n");
        str.append("Birthday: ").append(birthday).append("\n");
        str.append("Age: ").append(getAge()).append("\n");
        str.append("Sex: ").append(sex).append("\n");

        return str.toString();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate jDay = LocalDate.of(1990, 8, 28);
        //Person josh = new Person(81, 374, "Josh Acker", jDay, 'm');

        //System.out.println(josh.toString());
    }

}
