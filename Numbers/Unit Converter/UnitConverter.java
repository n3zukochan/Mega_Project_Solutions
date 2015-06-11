/**
 * Program: Unit Converter
 * Author: Hiep Can
 * Date: 06/09/2015
 *
 * Description: This program converts various units between one another.
 */

import java.util.*;

public class UnitConverter {
    // Should I make this a constant?
    public static final String[] MEASUREMENT = new String[] {
        "temp"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String type = "";

        intro();

        System.out.print("What type of measurement do you want to use? ");
        type = input.nextLine();
        while (!Arrays.asList(MEASUREMENT).contains(type)) {
            System.out.println("Your input was wrong! Please retype your choice!");
            System.out.println();
            System.out.print("What type of measurement do you want to use? ");
            type = input.nextLine();
        }
        
        convert(type);
    }

    /*
     * Introduce the UnitConverter program
     */
    public static void intro() {
        System.out.println();

        System.out.println("This program converts available units between one another");
        System.out.println("of a given type of measurement.");
        System.out.println();

        System.out.println("The types of measurement that can be used are listed below");
        System.out.println("in this format:        Measurement_name (input)");
        System.out.println("    - Temperature (temp)");
        System.out.println();
    }

    public static void convert(String type) {
        switch (type) {
            case "temp":
                break;
            default:
                break;
        }
    }
}
