package JP_Morgan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class JP_Morgan_3 {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(checkCharacters(line));
        }
    }


    public static String checkCharacters(String input) {
        int checkPassed = 0;
        char[] inputArray = input.toCharArray();
        checkPassed += inputArray[0] == '(' && inputArray[1] == ')' ? 1 : 0;
        checkPassed += inputArray[0] == '[' && inputArray[1] == ']' ? 1 : 0;
        checkPassed += inputArray[0] == '{' && inputArray[1] == '}' ? 1 : 0;

        return checkPassed > 0 ? "True" : "False";
    }

}
