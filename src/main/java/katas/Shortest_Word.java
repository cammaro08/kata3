package katas;

public class Shortest_Word {

    public static int findShort(String s) {
        String[] words = s.split(" ");
        int wordLength = words[0].length();

        for (String c : words) {
            wordLength = wordLength < c.length() ? wordLength : c.length();
        }
        return wordLength;
    }

}
