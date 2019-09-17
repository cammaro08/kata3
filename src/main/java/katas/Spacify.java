package katas;

public class Spacify {

    public static String spacify(String str) {

        StringBuilder bldr = new StringBuilder();
        for (char charInString : str.toCharArray()) bldr.append(charInString).append(" ");
        bldr.deleteCharAt(bldr.length()-1);

        return bldr.toString();
    }
}
