package katas;

public class PIN_code {

    public static boolean validatePin(String pin) {

        if(pin.length() == 4 | pin.length() == 6){
            for(char pinValue : pin.toCharArray())
                return Character.isDigit(pinValue);
        }
        return false;
    }
}

/* https://www.codewars.com/kata/regex-validate-pin-code/solutions?show-solutions=1 */