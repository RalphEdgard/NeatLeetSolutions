class Solution {
    public boolean wordPattern(String pattern, String s) {

        // Maps each word from the string to a character from the pattern.
        Map<String, String> map = new HashMap<>();

        // Stores every unique character found in the pattern.
        Set<String> chars = new HashSet<>();

        // Split the sentence into individual words.
        String[] arr = s.split(" ");

        // A valid pattern requires one word for every pattern character.
        if (arr.length != pattern.length()) {
            return false;
        }

        // Build and validate the word-to-character mapping.
        for (int i = 0; i < pattern.length(); i++) {

            // Convert the current pattern character into a String.
            String currentChar = pattern.charAt(i) + "";

            // Add the character to the set of unique pattern characters.
            chars.add(currentChar);

            /*
             * If the current word already has a mapping and the current
             * pattern character is already used somewhere in the map,
             * verify that this word maps to the expected character.
             */
            if (map.get(arr[i]) != null && map.containsValue(currentChar)) {
                if (!map.get(arr[i]).equals(currentChar)) {
                    return false;
                }
            }

            // Store or update the mapping from the current word
            // to the current pattern character.
            map.put(arr[i], currentChar);
        }

        // Keeps track of pattern characters already encountered
        // among the final mappings.
        String valsEncountered = "";

        // Verify that two different words do not map
        // to the same pattern character.
        for (Map.Entry<String, String> vals : map.entrySet()) {

            // If this character has already appeared as a mapped value,
            // then the mapping is not one-to-one.
            if (valsEncountered.contains(vals.getValue())) {
                return false;
            }

            // Record the mapped character as encountered.
            valsEncountered = valsEncountered + vals.getValue();
        }

        /*
         * The number of unique pattern characters should equal
         * the number of unique mapped words.
         */
        if (chars.size() != map.size()) {
            return false;
        }

        // No mapping conflicts were found.
        return true;
    }
}
