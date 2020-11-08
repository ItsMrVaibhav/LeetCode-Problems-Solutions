class Solution:
    def reverse(self, x: int) -> int:
        number = int(str(x)[::-1]) if x >= 0 else -int(str(abs(x))[::-1]) # Considering absolute value when the number is negative, and making it negative after reversing
        
        return number if (-2 ** 31) <= number <= (2**31 - 1) else 0 # Return the reversed number if it lies within the limit. Otherwise, zero.
        
