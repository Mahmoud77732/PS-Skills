# LinkedList-Reverse

A simple Java project demonstrating how to reverse a singly linked list. This project is ideal for learning basic data structures and algorithms, especially linked list manipulation.

## Features
- Implementation of singly linked list
- Function to reverse the linked list
- Example usage in main method
- Clean, beginner-friendly code

## Directory Structure
```
LinkedList-Reverse/
├── build.xml
├── manifest.mf
├── nbproject/
│   └── ... (NetBeans project files)
├── src/
│   └── com/
│       └── hegazy/
│           └── ps/
│               ├── LinkedListReverse.java
│               └── ListNode.java
└── test/
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- (Optional) Apache Ant for build automation

### Build & Run

#### Using Command Line
1. Compile the source files:
   ```bash
   javac -d bin src/com/hegazy/ps/*.java
   ```
2. Run the main class:
   ```bash
   java -cp bin com.hegazy.ps.LinkedListReverse
   ```

#### Using NetBeans
- Open the project folder in NetBeans and use the built-in run/build commands.

## Usage Example
The main method in `LinkedListReverse.java` demonstrates how to create a linked list, reverse it, and print the result.

```
Input:  1 -> 2 -> 3 -> 4 -> 5
Output: 5 -> 4 -> 3 -> 2 -> 1
```

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License. 