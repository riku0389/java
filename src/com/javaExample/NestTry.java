package com.javaExample;

public class NestTry {
    public static void main(String[] args) {
        try {
//            int a = args.length;
//            int a = 1;
            int a = 2;

            int b = 42 / a;

            System.out.println("a= " + a);
            System.out.println("b= " + b);

            try {
                if (a == 1) a = a / (a - a);

                if (a == 2) {
                    int c[] = {1};
                    c[43] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Devide by 0:" + e);
        }
    }
}
