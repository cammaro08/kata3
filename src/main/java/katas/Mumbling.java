package katas;

public class Mumbling {

    public static String accum(String s) {

        StringBuilder bldr = new StringBuilder();
        int loopValue = 0;
        for (char c : s.toCharArray()) {
            if (loopValue > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));

            for (int repeatLetters = 0; repeatLetters < loopValue; repeatLetters++)
                bldr.append(Character.toLowerCase(c));

            loopValue++;
        }
        return bldr.toString();
    }


}

