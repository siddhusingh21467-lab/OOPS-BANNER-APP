public class UC6 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[]{
            "****** ",
            "*     *",
            "****** ",
            "*      ",
            "*      "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {
        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use the loop to Assemble each line of the banner to create the
        // visual effect for the message "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}