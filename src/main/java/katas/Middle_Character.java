package katas;

public class Middle_Character {

    public static String getMiddle(String word) {

        StringBuilder bldr = new StringBuilder();
        int middleCharIndex = word.length() / 2;

        if (word.length() % 2 == 0) {
            bldr.append(word.charAt(middleCharIndex - 1));
            bldr.append(word.charAt(middleCharIndex));
        } else {
            bldr.append(word.charAt(middleCharIndex));
        }
        return bldr.toString();
    }
}
