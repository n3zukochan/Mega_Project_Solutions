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
    public static final Map<String, String> MEASUREMENT;
    static {
        MEASUREMENT = new HashMap<String, String>();
        MEASUREMENT.put("temp", "temperature");
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        boolean flag = true;

        intro();

        while (flag) {
            String answer = "";
            convert(input);
            System.out.print("Do you want to choose another type of measurement? Yes(y) or No(n)? ");
            answer = input.nextLine();
            if (answer.toLowerCase().startsWith("n")) {
                flag = false;
            }
        }
    }

    /**
     * Introduce the UnitConverter program
     */
    public static void intro() {
        System.out.println();

        System.out.println("This program converts available units between one another");
        System.out.println("of a given type of measurement.");
        System.out.println();

        System.out.println("The types of measurement that can be used are listed below");
        System.out.println("    - Temperature (temp)");
        System.out.println();
    }

    public static void convert(Scanner input) {
        String type = "";
        boolean temp = true;

        System.out.print("What type of measurement do you want to use? ");
        type = input.nextLine();
        while (!MEASUREMENT.containsKey(type)) {
            System.out.println("Your input was wrong! Please retype your choice!");
            System.out.println();
            System.out.print("What type of measurement do you want to use? ");
            type = input.nextLine();
        }

        while (temp) {
            String reply = "";

            System.out.println("Conversion type will be " + MEASUREMENT.get(type));
            System.out.println("These are your choices of units:");
            switch (type) {
                case "temp":
                    System.out.printf("The value after conversion is %.3f", tempConverter(input));
                    System.out.println();
                    break;
                default:
                    break;
            }

            System.out.print("Do you want to convert another unit? Yes(y) or No(n)? "); 
            reply = input.nextLine();
            System.out.println(reply);
            if (reply.toLowerCase().startsWith("n")) {
                temp = false;
            }
        }
    }

    public static double tempConverter(Scanner input) {
        String fromUnit = "";
        String toUnit = "";
        double value = 0;

        System.out.println("    - Celsius (c)"); 
        System.out.println("    - Fahrenheit (f)");
        System.out.println("    - Kelvin (k)");
        System.out.println();

        System.out.println("You want to convert");
        System.out.print("from: ");
        fromUnit = input.nextLine();
        System.out.print("to:   ");
        toUnit = input.nextLine();
        System.out.print("The value is ");
        value = input.nextDouble();
        input.nextLine();

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
