# FindMissingNumber

A simple Java application to find the missing number in an array containing distinct integers from 1 to n+1.

## Problem Statement
Given an array of size `n` containing distinct integers from the range `[1, n+1]`, find the missing number.

**Example:**
```
Input:  [1, 2, 4, 5, 6]
Output: 3
```

## Approach
The algorithm provides two methods to find the missing number:

### 1. Sum Formula Approach
Uses the mathematical formula for the sum of the first `n+1` natural numbers:

```
expectedSum = ((n + 1) * (n + 2)) / 2
```
where `n` is the length of the input array. The missing number is found by subtracting the actual sum of the array from the expected sum.

### 2. XOR Approach
Uses the properties of XOR:
- XOR all numbers from 1 to n+1
- XOR all elements in the array
- The XOR of these two results gives the missing number

This works because identical numbers cancel each other out in XOR, leaving only the missing number.

**XOR Properties:**
- XOR-ing a number with itself cancels it out: `a ^ a = 0`
- XOR-ing with 0 leaves the number unchanged: `a ^ 0 = a`

**Example with Binary:**
```
Input: [1, 2, 4, 5, 6] (missing 3)

xorAll = 0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 = 7 (0111 in binary)
xorArr = 0 ^ 1 ^ 2 ^ 4 ^ 5 ^ 6 = 4 (0100 in binary)
Result = xorAll ^ xorArr = 7 ^ 4 = 3 (0011 in binary)
```

**Step-by-step XOR calculation:**
- `xorAll`: 0000 → 0001 → 0010 → 0011 → 0100 → 0101 → 0110 = 0111 (7)
- `xorArr`: 0000 → 0001 → 0010 → 0100 → 0101 → 0110 = 0100 (4)
- Final result: 0111 ^ 0100 = 0011 (3)

## Usage
1. **Compile the Java file:**
   ```bash
   javac src/com/hegazy/ps/FindMissingNumber.java
   ```
2. **Run the program:**
   ```bash
   java -cp src com.hegazy.ps.FindMissingNumber
   ```

## Example Output
```
Missing number is: 3
Missing number (XOR) is: 3
```

## Algorithm
1. **Sum Formula:**
   - Calculate the expected sum of numbers from 1 to n+1.
   - Calculate the actual sum of the array elements.
   - The missing number is `expectedSum - actualSum`.
2. **XOR:**
   - XOR all numbers from 1 to n+1.
   - XOR all elements in the array.
   - The missing number is the XOR of these two results.

## Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## License
This project is licensed under the MIT License.
