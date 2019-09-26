package katas;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        StringBuilder bldr = new StringBuilder();
        String[] phraseSplit = phrase.split(" ");
        for (String s : phraseSplit) bldr.append(capitalAlpha(s)).append(" ");

        return bldr.toString().trim();
    }


    protected static String capitalAlpha(String word) {
        StringBuilder bldr = new StringBuilder();
        char[] inputWord = word.toCharArray();

        bldr.append(Character.toUpperCase(inputWord[0]));
        for (int i = 1; i < inputWord.length; i++) {
            bldr.append(inputWord[i]);
        }
        return bldr.toString();
    }
}
