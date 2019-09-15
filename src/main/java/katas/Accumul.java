package katas;

public class Accumul {

//    public static String accum(String s) {
//
//        int stringLength = s.length();
//        int loopValue = 0;
//        char stringInChar[] = s.toCharArray();
//        String answer = String.valueOf(stringInChar[0]);
//
//        while (loopValue < stringLength){
//
//            for(int i =0; i<loopValue; i++){
//                answer += String.valueOf(stringInChar[loopValue]); }
//
//            answer += "-";
//            loopValue ++;
//        }
//
//
//        return answer;
//    }

    public static String accum(String s) {

        StringBuilder builder = new StringBuilder();
        char inputAsChar[] = s.toCharArray();
        int loopValue = 0;

        do {
            String value = String.valueOf((inputAsChar[loopValue]));
            builder.append(value.toUpperCase() + "-");
            loopValue++;
        }
        while (loopValue < s.length());{

            String value = String.valueOf((inputAsChar[loopValue]));
            builder.append(value.toUpperCase() + "-");

        }

        return builder.toString();
    }
}

