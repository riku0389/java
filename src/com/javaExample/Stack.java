package com.javaExample;

public class Stack {
    int stck[]=new int[10];
    int tos;

    //Initialize top-of-stack

    public Stack() {
        tos=-1;
    }

    //push an item onto the stack
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            stck[++tos]=item;
    }

    //Pop an item from th estack
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return  stck[tos--];
    }
}
