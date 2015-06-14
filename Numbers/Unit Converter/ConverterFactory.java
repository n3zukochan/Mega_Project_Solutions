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
     */
    public Converter getConverter(String measurementType) {
        if (measurementType == null) {
            throw new IllegalArgumentException();
        }

        if (measurementType.equals("temperature")) {
            return new Temperature();
        } else if (measurementType.equals("length")) {
            return new Length();
        }
        return null;
    }
}
