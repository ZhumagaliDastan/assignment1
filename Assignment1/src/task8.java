public class task8 {
    public static boolean allDigits(String s) {
        if (s.length() == 0) { // base case: empty string is all digits
            return true;
        } else if (!Character.isDigit(s.charAt(0))) { // base case: first character is not a digit
            return false;
        } else { // recursive case: check remaining characters
            return allDigits(s.substring(1));
        }
    }
}
