package com.hegazy.ps;

import java.util.Stack;

public class MyQueue {
    
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    // Enqueue (push element to the end)
    public void enqueue(int x){
        inStack.push(x);
    }
    
    // Dequeue (remove from front)
    public int dequeue(){
        shiftStacks();
        return outStack.pop();
    }
    
    // Peek (get front element)
    public int peek(){
        shiftStacks();
        return outStack.peek();
    }
    
    // Check if queue is empty
    public boolean empty(){
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Transfer inStack to outStack only when outStack is empty
    private void shiftStacks(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
    }
    
}
