package com.company;
import java.util.*;

public class QueueStacks<T> {
    Stack<T> stackNewest, stackOldest;

    public QueueStacks(){
        stackNewest = new Stack<T>();
        stackOldest = new Stack<T>();
    }
    public int size() {
        return stackNewest.size() + stackOldest.size();
    }
    public void add(T value) {
        stackNewest.push(value);
    }
    public void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }
    public T peek() {
        shiftStacks();
        return stackOldest.peek();
    }
    public T remove() {
        shiftStacks();
        return stackOldest.pop();
    }
}
