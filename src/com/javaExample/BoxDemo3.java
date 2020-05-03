package com.javaExample;

import javafx.scene.shape.Box;

class Boxs {
    double width;
    double height;
    double depth;

    //display colume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Boxs myBoxs1 = new Boxs();
        Boxs myBoxs2 = new Boxs();

        myBoxs1.width = 10;
        myBoxs1.height = 20;
        myBoxs1.depth = 15;

        myBoxs2.width = 3;
        myBoxs2.height = 6;
        myBoxs2.depth = 9;

        myBoxs1.volume();
        myBoxs2.volume();
    }
}
