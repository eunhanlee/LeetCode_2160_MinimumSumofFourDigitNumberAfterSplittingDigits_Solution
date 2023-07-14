package org.example;

import java.util.Arrays;
public class Solution {
    /**
     * Finds the minimum sum of a four-digit number after splitting its digits.
     *
     * @param num the four-digit number
     * @return the minimum sum of the digits after splitting the number
     */
    public int minimumSum(int num) {
        int[] digits = new int[4];

        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(digits);

        return digits[0] * 10 + digits[1] * 10 + digits[2] + digits[3];
    }
}
