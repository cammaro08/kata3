package am.practice;

import java.lang.reflect.Array;
import java.util.*;

public class oddOccurencesInArray {
    private static int oddOne;

    protected static int oddOccuranceInArray(int[] inputArray) {

        //ist<Integer> uniqueNumbers = returnWithUniqueNumbers(inputArray);
        Integer[] wrapper = Arrays.stream(inputArray)
                .boxed()
                .toArray(Integer[]::new);

        Set<Integer> uniqueNumbers = new HashSet<Integer>(Arrays.asList(wrapper));

        for (int o : uniqueNumbers) {
            int counter = 0;

            for (int m : inputArray) if (o / m == 1) counter++;
            if (counter % 2 != 0) {
                oddOne = o;
                break;
            }
        }
        return oddOne;
    }

    private static List<Integer> returnWithUniqueNumbers(int[] inputArray) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        int oddOne;
        for (int p : inputArray) {
            if (!uniqueNumbers.contains(p)) {
                uniqueNumbers.add(p);
            }
        }
        return uniqueNumbers;
    }


}
