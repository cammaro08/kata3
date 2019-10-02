package am.practice;

//returns (int) the longest binary gap for a given integer

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class iteration {

    protected static int findBinaryGap(int number) {
        int binaryGap = 0;
        int longestGap = 0;
        String numberInBinary = Integer.toBinaryString(number);

        for(char s : numberInBinary.toCharArray()) {
            if (s == '1') {
                longestGap = (Math.max(binaryGap, longestGap));
                binaryGap = 0;
            } else
                binaryGap += 1;
        }
        return longestGap;
    }

}