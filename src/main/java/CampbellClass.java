/**
 * Contains conversions for strings, cm to m, and removing non letters from input
 * @author Kumail
 * @version 1.0
 */
public final class CampbellClass {

    /**
     * Private constructor
     * Makes a new CampbellClass
     */
    private CampbellClass() {
    }
    /**
     * Converts an int to a string
     *
     * @param value int value
     * @return String version of value
     */
    public static String convertString(int value) {
        return String.valueOf(value);
    }

    /**
     * Converts a double to a string
     *
     * @param value double value
     * @return String version of value
     */
    public static String convertString(double value) {
        return String.valueOf(value);
    }

    /**
     * Converts a char to a string
     *
     * @param value char value
     * @return String version of value
     */
    public static String convertString(char value) {
        return String.valueOf(value);
    }

    /**
     * Converts a boolean to a string
     *
     * @param value boolean value
     * @return String version of value
     */
    public static String convertString(boolean value) {
        return String.valueOf(value);
    }

    /**
     * Converts meters to centimeters
     * Returns an int to match the input type
     *
     * @param meters meters as int
     * @return centimeters as int
     */
    public static int convertMetersToCenti(int meters) {
        return meters * 100;
    }
    /**
     * Converts meters to centimeters
     * Returns a double to match the input type
     *
     * @param meters meters as double
     * @return centimeters as double
     */
    public static double convertMetersToCenti(double meters) {
        return meters * 100.0;
    }
    /**
     * Removes all non letter characters from a string
     *
     * @param input the input string
     * @return letters only
     */
    public static String removeNonAlpha(String input) {
        if (input == null) {
            return "";
        }
        return input.replaceAll("[^A-Za-z]", "");
    }

    /**
     * Removes all non letter characters and forces case
     *
     * @param input     the input string
     * @param uppercase  the uppercase/lowercase result
     * @return letters only in requested case
     */
    public static String removeNonAlpha(String input, boolean uppercase) {
        String lettersOnly = removeNonAlpha(input);
        return uppercase ? lettersOnly.toUpperCase() : lettersOnly.toLowerCase();
    }
}