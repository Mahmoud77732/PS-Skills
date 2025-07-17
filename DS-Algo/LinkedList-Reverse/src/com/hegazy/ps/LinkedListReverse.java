package com.hegazy.ps;

public class LinkedListReverse {

    /*
    Original List:
        1 -> 2 -> 3 -> 4 -> 5

    Reversed List (Iterative):
        5 -> 4 -> 3 -> 2 -> 1

    Reversed List (Recursive):
        5 -> 4 -> 3 -> 2 -> 1
    */
    
    public static void main(String[] args) {
        System.out.println("Original List:");
        ListNode head1 = createSampleList();
        printList(head1);

        System.out.println("\nReversed List (Iterative):");
        ListNode reversedIterative = reverseListIterative(head1);
        printList(reversedIterative);

        // Re-create the list to test recursive approach
        System.out.println("\nReversed List (Recursive):");
        ListNode head2 = createSampleList();
        ListNode reversedRecursive = reverseListRecursive(head2);
        printList(reversedRecursive);
    }
    
    /*
    ✅ Iterative Reversal
        - Time Complexity: O(n)
        - Space Complexity: O(1)
        - Speed: Faster in practice
    ? Why?
        - No overhead from function calls
        - No stack frames — constant memory
        - Efficient CPU usage;
    */
    // Iterative method
    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }
    
    /*
    ❗ Recursive Reversal
        - Time Complexity: O(n)
        - Space Complexity: O(n) — due to recursive call stack
        - Speed: Slower for large lists
    ? Why?
        - Each recursive call adds a new frame to the call stack
        - Function call overhead can slow it down
        - Risk of StackOverflowError if the list is too long (e.g., >10,000 nodes)
    */
    // Recursive method
    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) { // not empty || not single node
            return head;
        }

        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    
    // Utility function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
    
    // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
    public static ListNode createSampleList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        return head;
    }
    
}
