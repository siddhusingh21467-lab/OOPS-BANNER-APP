public class UC7 {

    /**
     * Inner class to store character and its ASCII pattern
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create and initialize mappings for O, P, S and space
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        };

        String[] pPattern = {
                "*****",
                "**  **",
                "**  **",
                "*****",
                "**",
                "**",
                "**"
        };

        String[] sPattern = {
                " *****",
                "**",
                "**",
                " *****",
                "     **",
                "     **",
                " *****"
        };

        String[] spacePattern = {
                "  ", "  ", "  ", "  ", "  ", "  ", "  "
        };

        return new CharacterPatternMap[] {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }

    /**
     * Retrieve pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        return new String[] {"?", "?", "?", "?", "?", "?", "?"};
    }

    /**
     * Print message as ASCII banner
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int line = 0; line < height; line++) {

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                System.out.print(pattern[line] + "  ");
            }

            System.out.println();
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}