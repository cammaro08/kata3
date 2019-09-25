package JP_Morgan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JP_Morgan_2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(checkIfHappyNumber(Integer.parseInt(line)));
        }
    }

    protected static int checkIfHappyNumber(int inputNumber) {
        List<Integer> previousResult = new ArrayList<Integer>();
        int sum = returnSumOfSplitNumberAndSquare(inputNumber);

        while (!previousResult.contains(sum)) {
            previousResult.add(sum);
            if (sum == 1) break;
            sum = returnSumOfSplitNumberAndSquare(sum);
        }
        return sum == 1 ? 1 : 0;
    }

    protected static int returnSquare(int number) {
        return number * number;
    }

    protected static int returnSumOfSplitNumberAndSquare(int number) {
        int sum = 0;
        char[] numberSplit = Integer.toString(number).toCharArray();
        for (char s : numberSplit) {
            sum += returnSquare(Integer.parseInt(Character.toString(s)));
        }
        return sum;
    }

    protected static boolean checkIfNumberInArray(int value, List<Integer> numberList) {
        return numberList.contains(value);
    }
}
