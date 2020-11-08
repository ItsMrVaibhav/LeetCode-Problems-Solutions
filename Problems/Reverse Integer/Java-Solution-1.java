import java.lang.Math;

class Solution {
    public int reverse(int x) {
        if (x <= ((-1) * Math.pow(2, 31)) || x > (Math.pow(2, 31) - 1)) {
            return 0;
        }
        
        String numberString, reversedNumber = "";
        
        if (x >= 0) {
            numberString = Integer.toString(x);
            
            for (int i = numberString.length() - 1 ; i >= 0 ; i--) {
                reversedNumber += numberString.substring(i, i + 1);
            }   
        } else {
            numberString = Integer.toString(x * (-1));
            reversedNumber = "-";
            
            for (int i = numberString.length() - 1 ; i >= 0 ; i--) {
                reversedNumber += numberString.substring(i, i + 1);
            }
        }
        
        long number = Long.parseLong(reversedNumber);
        
        if (number >= ((-1) * Math.pow(2, 31)) && number <= (Math.pow(2, 31) - 1)) {
            return (int) number;
        } else {
            return 0;
        }
    }
}
