/**
 * Program: Converter Factory
 * Author: Hiep Can
 * Date: 06/12/2015
 *
 * Description: This program creates a Factory to generate the corresponding 
 *              Converter based on the given information.
 */

public class ConverterFactory {
    /**
     * Get the corresponding converter based on the given measurement type
     *
     * @param  measurementType the type of measurement
     * @return                 the corresponding converter
     */
    public Converter getConverter(String measurementType) {
        if (measurementType.equals("temperature")) {
            return new Temperature();
        } else if (measurementType.equals("length")) {
            return new Length();
        } else if (measurementType.equals("mass")) {
            return new Mass();
        }

        return null;
    }
}
