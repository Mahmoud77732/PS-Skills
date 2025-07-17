package com.hegazy.ps;

public class FirstNonRepeatingChar {
    
    /*
    Input:  "leetcode"
    Output: 0   // 'l' is the first non-repeating character

    Input:  "loveleetcode"
    Output: 2   // 'v' is the first non-repeating character

    Input:  "aabb"
    Output: -1  // No non-repeating character
    */

    public static void main(String[] args) {
        String input = "leetcode";
        int result = firstUniqueChar(input);
        System.out.println("First non-repeating character index: " + result);
    }
    
    
    /*
    ⏱ Time and Space Complexity
        - Time: O(n) — one pass to count, one pass to find
        - Space: O(1) — fixed 26-element array (for lowercase letters)
    
    📌! Notes:
        - note(1)
            - "a" is 97
            - "A" is 65
        - note(2)
            - If the string may contain uppercase, use int[256] or a HashMap<Character, Integer>.
            - This solution is efficient and safe for large inputs.
    */
    // return index of the required char (1st non-repeating char)
    public static int firstUniqueChar(String str){
        int[] freq = new int[26]; // Since only lowercase letters
        // count frequencies
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++; // ASCII code
            System.out.println("freq-index= " + (ch - 'a') + " string-charAt= " + ch + " ASCII-CODE-Operation= " + ch + " - " + "a = " + (int) ch + " - 97 = " + ((int)ch - 97));
        }
        // find first non-repeating char
        for (int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1; // all chars are repeated
    }
    
}
