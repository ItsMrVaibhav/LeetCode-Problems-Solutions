class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend <= -2147483648 && divisor == -1 || dividend > 2147483647) {
            return 2147483647;
        } else if (divisor == 1) {
            return dividend;
        } else if (divisor == -1) {
            return -dividend;
        }
        
        long longDividend = (long) dividend;
        long longDivisor = (long) divisor;
        int quotient = 0;
                    
        if (longDivisor > 0 && longDividend >= 0) {
            while (longDividend >= longDivisor) {
                quotient++;
                longDividend -= longDivisor;
            }
        } else if (longDivisor > 0 && longDividend < 0) {
            while (-longDividend >= longDivisor) {
                quotient--;
                longDividend += longDivisor;
            }
        } else if (longDivisor < 0 && longDividend > 0) {
            while (longDividend >= -longDivisor) {
                quotient--;
                longDividend -= -longDivisor;
            }
        } else if (longDivisor < 0 && longDividend < 0) {
            while (-longDividend >= -longDivisor) {
                quotient++;
                longDividend += -longDivisor;
            }
        } 
        
        return quotient;
    }
}
