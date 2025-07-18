# PalindromeChecker

A simple Java application to check if a given string is a palindrome. The checker ignores spaces, punctuation, and case, making it suitable for phrases and sentences as well as single words.

## Features
- Checks if a string is a palindrome
- Ignores spaces, punctuation, and case
- Efficient O(n) time and space complexity

## Example
```
Input:  "Race car"
Output: true

Input:  "Hello"
Output: false

Input:  "Was it a car or a cat I saw"
Output: true
```

## Usage
The main logic is in `PalindromeChecker.java`:
- The `isPalindrome(String s)` method normalizes the input and checks for palindrome property using a two-pointer approach.

## How to Run
This project uses Java 21 and is structured for NetBeans/Ant, but you can compile and run it from the command line as well.

### Using NetBeans
1. Open the project in NetBeans.
2. Build and run the project (default main class: `com.hegazy.ps.PalindromeChecker`).

### Using Command Line
1. Ensure you have Java 21 installed.
2. Navigate to the project root directory.
3. Compile the source:
   ```bash
   javac -d build/classes src/com/hegazy/ps/PalindromeChecker.java
   ```
4. Run the program:
   ```bash
   java -cp build/classes com.hegazy.ps.PalindromeChecker
   ```

## Project Structure
```
PalindromeChecker/
├── build.xml                # Ant build script
├── manifest.mf              # Manifest file
├── src/
│   └── com/
│       └── hegazy/
│           └── ps/
│               └── PalindromeChecker.java
├── nbproject/               # NetBeans project files
└── test/                    # (empty, for future tests)
```

## Customization
- To check your own string, modify the `input` variable in the `main` method of `PalindromeChecker.java`.
- The normalization step can be adjusted to include/exclude punctuation as needed.

## License
This project is provided for educational purposes. 