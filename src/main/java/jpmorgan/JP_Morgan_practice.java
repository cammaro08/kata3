package jpmorgan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JP_Morgan_practice {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(checkIfHappyNumber(line));
        }
    }

    protected static String checkIfHappyNumber(String input) {
        List<String> previousResult = new ArrayList<String>();
        String result = input;

        while (!previousResult.contains(result)) {
            previousResult.add(result);
            result = returnSumOfSquares(result);

            if (result.equals("1") || result.equals("0")) break;
        }
        return result.equals("1") ? "1" : "0";
    }

    protected static String returnSumOfSquares(String number) {
        int sum = 0;
        char[] numberSplit = number.toCharArray();
        for (char s : numberSplit) {
            sum += Integer.parseInt(Character.toString(s)) * Integer.parseInt(Character.toString(s));
        }
        return Integer.toString(sum);
    }


}
