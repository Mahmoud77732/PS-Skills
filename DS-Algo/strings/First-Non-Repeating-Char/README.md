# First Non-Repeating Character

A simple Java program to find the index of the first non-repeating character in a given string.

## Problem Statement
Given a string, return the index of the first non-repeating character. If there is no such character, return -1.

**Examples:**
- Input: `"leetcode"`  → Output: `0`  // 'l' is the first non-repeating character
- Input: `"loveleetcode"`  → Output: `2`  // 'v' is the first non-repeating character
- Input: `"aabb"`  → Output: `-1`  // No non-repeating character

## Solution Approach
- Count the frequency of each character using an array (assuming only lowercase English letters).
- Iterate through the string to find the first character with a frequency of 1.

## Time and Space Complexity
- **Time Complexity:** O(n) — one pass to count, one pass to find
- **Space Complexity:** O(1) — fixed 26-element array (for lowercase letters)

## Usage

### Prerequisites
- Java JDK 8 or higher

### Build & Run
1. **Compile:**
   ```bash
   javac -d . src/com/hegazy/ps/FirstNonRepeatingChar.java
   ```
2. **Run:**
   ```bash
   java com.hegazy.ps.FirstNonRepeatingChar
   ```

### Example Output
```
First non-repeating character index: 0
```

## Custom Input
To test with a different string, edit the `input` variable in the `main` method of `FirstNonRepeatingChar.java`.

## Notes
- The current implementation assumes only lowercase English letters. For uppercase or other characters, modify the frequency array size or use a `HashMap<Character, Integer>`.
- Efficient and safe for large inputs.

## Author
- [Your Name] 