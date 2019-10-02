package blackrock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class blkRock3 {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println();
        }
    }


    public static String numberOfPatternMatched(String pattern, String blob) {
        StringBuilder bldr = new StringBuilder();
        int totalPatternMatched = 0;
        String[] blobSplit = blob.split("\\|");

        for (String s : blobSplit){
            int patternMatched = matchPatternWithString(pattern, s);
            totalPatternMatched += patternMatched;
            bldr.append(patternMatched).append("|");
        }

        bldr.append(totalPatternMatched);
        return bldr.toString();
    }


    private static int matchPatternWithString(String pattern, String blob) {
        int totalMacthesInString = 0;
        int patternIncrement = pattern.length();
        int loop = 0;
        int subStringStarting = 0;
        int subStringEnding = patternIncrement;

        while(loop < blob.length()){
            try{
                String pieceOfBlob = blob.substring(subStringStarting, subStringEnding);
                totalMacthesInString += (pattern.equals(pieceOfBlob) ? 1 : 0);
            }
            catch (Exception e) { break;}
            subStringStarting = subStringEnding;
            subStringEnding += patternIncrement;
            loop += (patternIncrement);
        }
        return totalMacthesInString;
    }


}




