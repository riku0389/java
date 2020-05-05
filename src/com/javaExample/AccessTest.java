package com.javaExample;

class TestAccess{
    int a;
    public int b;
    private int c;

    void setc(int i){
        c=i;
    }
    int setc(){
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        TestAccess ob=new TestAccess();

        ob.a=10;
        ob.b=20;


        ob.setc(100);
        System.out.println("a,b,and c: "+ob.a+" "+ob.b+" "+ob.setc());
    }
}
