package com.javaExample;

class TestCall {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        TestCall ob = new TestCall();
        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);

    }
}
