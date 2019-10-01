package am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class other {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println();
        }
    }


    protected static String coinDenomiation(int[] denomination, int value) {
        int remaining = value;
        int[] result = new int[]{};
        int sizeOfResult = 0;


        for (int i : denomination) {
            for (int j = 0; j < remaining / i; j++) {
                Array.set(result, sizeOfResult, i);
                remaining -= i;
                sizeOfResult += 1;
            }
        }

        return Arrays.toString(result);

    }


}
