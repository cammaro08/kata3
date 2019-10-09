package am;

import java.lang.reflect.Array;
import java.util.*;


public class am1 {


    public static int solution(String input) {

        //aaa

        char toCompare = input.charAt(0);
        char[] resultArray = new char[input.length()];
        int reset = 1;
        int swapCount = 0;

        for (int i = 0; i<input.length(); i++){
            if(toCompare == input.charAt(i)){
                reset += 1;
                resultArray[i] = input.charAt(i);

                if(reset == 3){
                    resultArray[i] = input.charAt(i) == 'a' ? 'b' : 'a';
                    swapCount += 1;
                    reset = 1;
                    toCompare = resultArray[i];
                    //System.out.println("lol");
                }
            }

            else{
                resultArray[i] = input.charAt(i);
                toCompare = resultArray[i];
                reset = 1;
            }


        }

        return swapCount;

    }

    public static int solution2(String s) {
        int moves = 0;
        for (int i = 0 ; i < s.length(); i++) {
            int runLength = 1;

            for (; i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1); i++) {
                runLength++;
            }
            moves += runLength / 3;
        }
        return moves;
    }

//    public  static int solution(String s) {
//        if (s.length() < 3) {
//            return 0;
//        }
//
//        int result = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            int countSameCharacters = 1;
//
//            for (int j = i + 1; j < s.length(); j++) {
//
//                if (s.charAt(i) == s.charAt(j)) {
//                    countSameCharacters++;
//
//                }
//            }
//            result += countSameCharacters / 3;
//        }
//        return result;
//
//    }


//    public  static int solution(String s) {
//        if (s.length() < 3) {
//            return 0;
//        }
//
//        int result = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            int countSameCharacters = 1;
//
//            for (int j = i + 1; j < s.length(); j++) {
//
//                if (s.charAt(i) == s.charAt(j)) {
//                    countSameCharacters++;
//                } else {
//                    break;
//                }
//            }
//            result += countSameCharacters / 3;
//        }
//        return result;
//
//    }

    public static int solution(String s) {
        if (s.length() < 3) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int countSameCharacters = 1;

            // we need to keep incrementing both j and i as we are checking the current and next together
            for (int j = i + 1; j < s.length(); j++, i++) {

                if (s.charAt(i) == s.charAt(j)) {
                    countSameCharacters++;
                } else {
                    // couldn't find consecutive characters
                    break;
                }
            }
            result += countSameCharacters / 3;
        }
        return result;

    }

}




public int dosomething(){

    int find_min(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

}