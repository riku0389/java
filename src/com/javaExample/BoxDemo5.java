package com.javaExample;

class boxs2 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}


public class BoxDemo5 {
    public static void main(String[] args) {
        boxs2 myBox1 = new boxs2();
        boxs2 myBox2 = new boxs2();
        double vol;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol=myBox1.volume();
        System.out.println("Volume is "+vol);

        System.out.println("Volume is "+myBox2.volume());

    }
}
