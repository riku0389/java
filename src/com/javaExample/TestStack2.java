package com.javaExample;

class Stacks {
    private int stack[];
    private int tos;

    public Stacks(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length - 1)
            System.out.println("Stack is full");
        else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stack[tos--];
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stacks myStack1 = new Stacks(5);
        Stacks myStack2 = new Stacks(8);

        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        System.out.println("Stack in MyStack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());
        System.out.println("Stack in myStack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
