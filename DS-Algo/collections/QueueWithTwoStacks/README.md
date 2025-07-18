# QueueWithTwoStacks

A Java implementation of a **queue** using two stacks. This classic data structure exercise demonstrates how to achieve FIFO (First-In-First-Out) queue behavior using only LIFO (Last-In-First-Out) stack operations.

## Features

- Implements a queue using two stacks (`inStack` and `outStack`)
- Supports standard queue operations:
  - `enqueue(x)`: Add element to the end of the queue
  - `dequeue()`: Remove and return the front element
  - `peek()`: Get the front element without removing it
  - `empty()`: Check if the queue is empty

## How It Works

- **Enqueue:** Push new elements onto `inStack`.
- **Dequeue/Peek:** If `outStack` is empty, transfer all elements from `inStack` to `outStack` (reversing order). Then pop/peek from `outStack`.
- This ensures that the oldest elements are always on top of `outStack`, preserving queue order.

## Project Structure

```
src/com/hegazy/ps/
  ├── MyQueue.java              # The queue implementation using two stacks
  └── QueueWithTwoStacks.java   # Main class with usage example
```

## Usage Example

```java
public class QueueWithTwoStacks {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.peek());    // 10
        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20
        System.out.println(q.empty());   // false
    }
}
```

## Building and Running

This project uses [Apache Ant](https://ant.apache.org/) for building and running.

### Prerequisites

- Java JDK 8 or higher (project uses Java 21 by default)
- Apache Ant

### Build

From the project root directory, run:

```bash
ant clean
ant build
```

### Run

To run the main class:

```bash
ant run
```

## Customization

- The main class is set to `com.hegazy.ps.QueueWithTwoStacks` by default.
- You can modify or extend `MyQueue.java` for additional queue features.

## License

This project is for educational purposes. No specific license. 