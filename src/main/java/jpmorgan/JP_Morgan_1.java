package jpmorgan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class JP_Morgan_1 {

        public static void main(String[] args) throws IOException {
            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(Integer.parseInt(line)*Integer.parseInt(line));
            }
        }

}
