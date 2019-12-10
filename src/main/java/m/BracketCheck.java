package m;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Stack;

public class BracketCheck {

    private static final HashMap<Character,Character> bracketMap = new HashMap<>();

    static {
        bracketMap.put('(',')');
        bracketMap.put('{','}');
        bracketMap.put('[',']');
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(checkCharacters(line));
        }
    }


    public static String checkBracket(String s) {
        if (s.length() % 2 != 0) {
            return "False";
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0 ; i < s.length() / 2; i++ ) {
            stack.push(s.charAt(i));
        }

        for (int i = (s.length()/2) ; i < s.length(); i++) {
            char nextInput = s.charAt(i);
            Character pop = stack.pop();
            Character expectedClosingElement = bracketMap.get(pop);
            if (nextInput != expectedClosingElement ) {
                return "False";
            }
        }

        return "True";
    }



    public static String checkCharacters(String input) {
        int checkPassed = 0;
        char[] inputArray = input.toCharArray();
        checkPassed += input.charAt(0)  == '(' && input.charAt(1) == ')' ? 1 : 0;
        checkPassed += input.charAt(0)  == '[' && input.charAt(1) == ']' ? 1 : 0;
        checkPassed += input.charAt(0)  == '{' && input.charAt(1) == '}' ? 1 : 0;

        return checkPassed > 0 ? "True" : "False";
    }
}
