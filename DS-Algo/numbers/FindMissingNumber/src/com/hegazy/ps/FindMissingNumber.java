package com.hegazy.ps;

public class FindMissingNumber {

    /*
     * Given an array of size 
     *      n containing distinct integers from 
     *      [ 1 to n+1 ], 
     *      find the missing number.
     * ex:
     *  Input:  [1, 2, 4, 5, 6]
     *  Output: 3
     * 
     * Sum formula:
     * The sum of first (n+1) natural numbers is:
     *      - expectedSum = ((𝑛+1) * (𝑛+2)) / 2 
     *      - Then subtract the actual sum of the array.
     */

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 5, 6};
        int missing = findMissing(input);
        System.out.println("Missing number is: " + missing); // Output: 3
        int missingXOR = findMissingXOR(input);
        System.out.println("Missing number (XOR) is: " + missingXOR); // Output: 3
    }

    /*
     * ⏱ Time & Space Complexity
     *     - Time: O(n)
     *     - Space: O(1)
     */
    public static int findMissing(int[] arr){
        int n = arr.length; // actual size is n
        int expectedSum = ((n+1) * (n+2)) / 2;
        int actualSum = 0; // sum of the elements of the array

        for(int num : arr){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    /**
     * Finds the missing number in an array containing distinct integers from 1 to n+1 using the XOR approach.
     *
     * XOR Approach Explanation:
     * - XOR all numbers from 1 to n+1 (let's call this xorAll).
     * - XOR all elements in the input array (let's call this xorArr).
     *! - Since XOR-ing a number with itself cancels it out (a ^ a = 0),
     *!   and XOR-ing with 0 leaves the number unchanged (a ^ 0 = a),
     * ------------------------------------------------
     * ex:
     *    0000
     *   ^ 0001 = 0001  → 1
     * ------------------------------------------------
     * Ex [1 : 6] -> [1, 2, 4, 5, 6] -> find the missing nmber (3):
     * 
     * xorAll = 0000 (0) -> 0001 (1) -> 0010 (2) -> 0011 (3) -> 0100 (4)  -> 0101 (5) -> 0110 (6) = 0111 (7)
     * xorArr = 0000 (0) -> 0001 (1) -> 0010 (2) -> 0100 (4) -> 0101 (5) -> 0110 (6) = 0100 (4)
     * xorAll XOR xorArr = 0111 (7) ^ 0100 (4) = 0011 (3)
     * ------------------------------------------------
     * 
     *   all numbers that appear in both the array and the full range will cancel out.
     * - The only number left after xorAll ^ xorArr will be the missing number.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int findMissingXOR(int[] arr) {
        int n = arr.length;
        int xorAll = 0;     // hold XOR of all numbers from 1 to n+1
        int xorArr = 0;     // hold XOR of all elements in the array
        // XOR all numbers from 1 to n+1
        for (int i = 1; i <= n + 1; i++) {
            xorAll ^= i;   // Accumulate XOR of numbers from 1 to n+1
        }
        // XOR all elements in the array
        for (int num : arr) {
            xorArr ^= num; // Accumulate XOR of all elements in the array
        }
        return xorAll ^ xorArr; // XOR of the above two results gives the missing number
    }
}



