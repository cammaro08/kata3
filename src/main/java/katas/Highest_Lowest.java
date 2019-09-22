package katas;

public class Highest_Lowest {

    public static String highAndLow(String numbers) {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (String c : numbers.split(" ")) {
            int n = Integer.parseInt(c);
            maxValue = maxValue < n ? n : maxValue;
            minValue = minValue > n ? n : minValue;
        }
        return maxValue + " " + minValue;
    }
}
