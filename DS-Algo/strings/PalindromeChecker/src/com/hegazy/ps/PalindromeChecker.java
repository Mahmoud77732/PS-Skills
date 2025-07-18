package com.hegazy.ps;

public class PalindromeChecker {
    
    /*
    * "Race car" → ✅ palindrome
    * "Hello" → ❌ not a palindrome
    * "Was it a car or a cat I saw" → ✅ palindrome (ignoring spaces/case)
    */

    public static void main(String[] args) {
        String input = "Was it a car or a cat I saw";
        System.out.println("Is palindrome? " + isPalindrome(input)); // true
        
        // * Bonus
        // if you Want to ignore punctuation too
        String str = "abc ABC, Sde, 123 ;";
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
    }
    
    /*
    ⏱ Time & Space Complexity
        - Time: O(n)
        - Space: O(n) (due to new string from normalization)
    */
    public static boolean isPalindrome(String s) {
        // Normalize the string: remove spaces and convert to lowercase
        s = s.replaceAll("\\s+", "").toLowerCase();
        
        // if you Want to ignore punctuation too
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = s.length() - 1;
        
        // two pointer check
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }
    
}
