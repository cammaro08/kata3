package blackrock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class blkRock2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(reverseString(line));
        }
    }

    protected static String reverseString(String letters){
        StringBuilder bldr = new StringBuilder();
        List<Character> toAdd = returnCharArrayWithOnlyAlphabets(letters);
        for (int i = toAdd.size() - 1; i >= 0 ; i--){
            bldr.append(toAdd.get(i));
            bldr.append("-");
        }
        return bldr.toString().substring(0,bldr.lastIndexOf("-"));
    }


    protected static List<Character> returnCharArrayWithOnlyAlphabets(String input){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        List<Character> stringToBeReversed = new ArrayList<Character>();

        for(char s : input.toLowerCase().toCharArray()){
            for (char w : alphabets.toCharArray()){
                if (s == w) stringToBeReversed.add(s);
            }
        }
        return stringToBeReversed;
    }
}
