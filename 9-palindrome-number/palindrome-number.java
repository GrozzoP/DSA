class Solution {
    public boolean isPalindrome(int x) {
        int n = Integer.toString(x).length(), inverseNumber = 0, number = Math.abs(x), digit;
        
        if(n == 0 || n == 1)
            return true;

        while(number != 0) {
            digit = number % 10;
            inverseNumber = inverseNumber * 10 + digit;
            number /= 10;
        }

        if(inverseNumber == x)
            return true;
        else
            return false;
    }
}