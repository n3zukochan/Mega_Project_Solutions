/**
 * Program: Speed
 * Author: Hiep Can
 * Date: 06/14/2015
 *
 * Description: This program creates a Speed Converter by extending
 *              the class Converter.
 */

import java.util.*;

public class Speed extends Converter {
    private String[] units;
    private double[] unitConstants;

    /**
     * Initialize the Speed constructor
     */
    public Speed() {
        units = new String[] {
            "mph", "fps", "mps", "kph"
        };

        unitConstants = new double[] {
            0.44704, 0.3048, 1, 0.27778
        };
    }

    /**
     * Print out the information of the speed units
     */
    public void unitsInfo() {
        System.out.println("    - Mile/hour (mph)");
        System.out.println("    - Feet/second (fps)");
        System.out.println("    - Meter/second (mps)");
        System.out.println("    - Kilometer/hour (kph)");
    }

    /**
     * Convert the unit from one type to another
     *
     * @return the value after converting
     */
    public double convert() {
        String fromUnit = getFromUnit();
        String toUnit = getToUnit();
        double value = getValue();
        int fromIndex = 0;
        int toIndex = 0;

        for (int i = 0; i < units.length; i++) {
            if (units[i].equals(fromUnit)) {
                fromIndex = i;
            }

            if (units[i].equals(toUnit)) {
                toIndex = i;
            }
        }
        value = value * unitConstants[fromIndex] / unitConstants[toIndex];

        return value;
    }
}
