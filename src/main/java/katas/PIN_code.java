package katas;

public class PIN_code {

    public static boolean validatePin(String pin) {

//        if(pin.length() == 4 | pin.length() == 6) return pin.chars().allMatch(Character::isDigit);
//        return false;

        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    return false;
                } else
                    return true;
            }
        }
        return false;
    }
}

/* https://www.codewars.com/kata/regex-validate-pin-code/solutions?show-solutions=1 */