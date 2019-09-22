package katas;

import java.util.List;

public class Sum_mixed {
    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object c : mixed) sum += Integer.parseInt(c.toString());
        return  sum;
    }
}
