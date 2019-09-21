package katas;

public class Highest_Lowest {

    public static String highAndLow(String numbers) {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(String toCompare : numbers.split(" ")) {
            if (maxValue < Integer.parseInt(toCompare)) maxValue = Integer.parseInt(toCompare);
            if (minValue > Integer.parseInt(toCompare)) minValue = Integer.parseInt(toCompare);
        }
        return "" + maxValue + " " + minValue;
    }
}
