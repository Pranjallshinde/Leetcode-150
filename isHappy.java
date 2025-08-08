//using Hashset
import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = squares(n);
        }
        
        return n == 1;
    }

    private int squares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;         // get last digit
            sum += digit * digit;       // square and add to sum
            n = n / 10;                 // remove last digit
        }
        return sum;
    }
}
