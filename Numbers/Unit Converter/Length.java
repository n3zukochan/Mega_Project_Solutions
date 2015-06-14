/**
 * Program: Temperature
 * Author: Hiep Can
 * Date: 06/12/2015
 *
 * Description: This program creates a Length Converter by extending
 *              the class Converter.
 */

import java.util.*;

public class Length extends Converter {
    private String type;

    /**
     * Initializes the Length constructor.
     */
    public Length() {
        this.type = "length";
    }

    /**
     */
    public void unitsInfo() {
        System.out.println("    - Kilometer (km)");
        System.out.println("    - Meter (m)");
        System.out.println("    - Centimeter (cm)");
        System.out.println("    - Millimeter (mm)");
        System.out.println("    - Mile (mi)");
        System.out.println("    - Yard (yd)");
        System.out.println("    - Foot (ft)");
        System.out.println("    - Inch (in)");
    }

    /**
     */
    public double convert() {
        String fromUnit = getFromUnit();
        String toUnit = getToUnit();
        double value = getValue();

        switch (fromUnit) {
            case "km":
                value *= 1000;
                break;
            case "cm":
                value /= 100;
                break;
            case "mm":
                value /= 1000;
                break;
            case "mi":
                value *= 5280 * 0.3048;
                break;
            case "yd":
                value *= 0.9144;
                break;
            case "ft":
                value *= 0.3048;
                break;
            case "in":
                value *= 0.0254;
                break;
        }

        switch (toUnit) {
            case "km":
                value /= 1000;
                break;
            case "cm":
                value *= 100;
                break;
            case "mm":
                value *= 1000;
                break;
            case "mi":
                value = value / (5280 * 0.3048);
                break;
            case "yd":
                value /= 0.9144;
                break;
            case "ft":
                value /= 0.3048;
                break;
            case "in":
                value /= 0.0254;
                break;
        }

        return value;
    }
}
