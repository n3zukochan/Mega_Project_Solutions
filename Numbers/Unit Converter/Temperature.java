/**
 * Program: Temperature
 * Author: Hiep Can
 * Date: 06/12/2015
 *
 * Description: This program creates a Temperature Converter by extending
 *              the class Converter.
 */

import java.util.*;

public class Temperature extends Converter {
    private String type;

    /**
     * Initializes the Temperature constructor.
     */
    public Temperature() {
        this.type = "temperature";
    }

    /**
     */
    public void unitsInfo() {
        System.out.println("    - Celsius (c)"); 
        System.out.println("    - Fahrenheit (f)");
        System.out.println("    - Kelvin (k)");
        System.out.println();
    }

    /**
     */
    public double convert() {
        String fromUnit = getFromUnit();
        String toUnit = getToUnit();
        double value = getValue();

        if (fromUnit.equals("c")) {
            value += 273.15;
        } else if (fromUnit.equals("f")) {
            value = (value - 32) * 5 / 9 + 273.15;
        }

        if (toUnit.equals("c")) {
            value -= 273.15;
        } else if (toUnit.equals("f")) {
            value = (value - 273.15) * 9 / 5 + 32;
        }

        return value;
    }
}
