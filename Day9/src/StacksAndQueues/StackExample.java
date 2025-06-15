package StacksAndQueues;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> string=new Stack<>();
        string.push("Hello");
        string.push("world");
        string.pop();
        string.push("Java");
        System.out.println(string);

    }
}
