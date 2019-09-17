package katas;

public class Vowel_Count {

    public static int getCount(String str) {
        int vowelsCount = 0;

        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        String vowelsString = "aeiou";

        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (str.charAt(i) == vowels[j]) vowelsCount++;
//            }
            //if (str.charAt(i) == 'a' || str.charAt('e') || str.charAt(i) || str.charAt())

            if (vowelsString.contains(str.charAt(i) + "")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}

