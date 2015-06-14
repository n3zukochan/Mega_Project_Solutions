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
    private String type;

    /** 
     * Initializes the Converter object
     */
    public Converter() {
        this.input = new Scanner(System.in);
        this.fromUnit = "";
        this.toUnit = "";
        this.value = 0;
        this.type = "";
    }
    
    /**
     */
    public String getFromUnit() {
        return this.fromUnit;
    }

    /**
     */
    public String getToUnit() {
        return this.toUnit;
    }

    /**
     */
    public double getValue() {
        return this.value;
    }

    /**
     */
    public String getType() {
        return this.type;
    }

    /**
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
     */
    public abstract void unitsInfo(); 

    /**
     */
    public abstract double convert();
}
