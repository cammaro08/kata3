package blackrock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class BLK_Rock_2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println();
        }
    }

    protected static String reverseString(List<Character> letters){
        StringBuilder bldr = new StringBuilder();
        for (int i = letters.size() - 1; i >= 0 ; i--){
            bldr.append(letters.get(i));
            bldr.append("-");
        }
        return bldr.toString().substring(0,bldr.lastIndexOf("-"));
    }


    protected static List<Character> returnCharArrayWithOnlyAlphabets(String input){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        //String inputModified = input.toLowerCase().replaceAll(" ","");
        char[] oldInput = input.toCharArray();
        char[] alphabetsToInsert = alphabets.toCharArray();
        List<Character> stringToBeReversed = new ArrayList<Character>();

        for(char s : oldInput){
            for (char w : alphabetsToInsert){
                if (s == w) stringToBeReversed.add(s);
            }
        }
        return stringToBeReversed;
    }
}
