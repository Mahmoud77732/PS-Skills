package com.hegazy.ps;

public class QueueWithTwoStacks {
    
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enqueue(10); // push element to the end
        q.enqueue(20);
        q.enqueue(30); // -> ]30 -> 20 -> 10]
        
        /*
        * we implemented FIFO queue using 2 Stacks
        
        (inStack)   
            TOP -> [30]
                   [20]
                   [10]
        
        (outStack)   
            TOP -> [10]
                   [20]
                   [30]
        */

        System.out.println(q.peek());   // 10 - get front element
        System.out.println(q.dequeue()); // 10 - remove from front
        System.out.println(q.peek());   // 20 - get front element
        System.out.println(q.empty());  // false
    }
    
}
