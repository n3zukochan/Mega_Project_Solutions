/**
 * Program: Converter
 * Author: Hiep Can
 * Date: 06/12/2015
 *
 * Description: This program is a Converter that provides information
 *              about the measurement units and converts the user's input
 *              to the corresponding unit.
 */

import java.util.*;

public abstract class Converter {
    private String fromUnit;
    private String toUnit;
    private double value;
    private Scanner input;

    /** 
     * Initializes the Converter object
     */
    public Converter() {
        this.input = new Scanner(System.in);
        this.fromUnit = "";
        this.toUnit = "";
        this.value = 0;
    }
    
    /**
     * @return the unit that the user wants to convert from
     */
    public String getFromUnit() {
        return this.fromUnit;
    }

    /**
     * @return the unit that the user wants to convert to
     */
    public String getToUnit() {
        return this.toUnit;
    }

    /**
     * @return the value that the user wants to convert
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Ask the user for the conversion input
     */
    public void userInput() {
        System.out.println("You want to convert");
        System.out.print("from: ");
        this.fromUnit = input.nextLine();
        System.out.print("to:   ");
        this.toUnit = input.nextLine();
        System.out.print("The value is ");
        this.value = input.nextDouble();
        input.nextLine();
    }

    /**
     * Print out the information of the measurement type
     */
    public abstract void unitsInfo(); 

    /**
     * Convert the unit from one type to another
     *
     * @return the value after converting
     */
    public abstract double convert();
}
