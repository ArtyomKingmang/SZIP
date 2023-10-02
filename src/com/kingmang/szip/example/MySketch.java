package com.kingmang.szip.example;

import com.kingmang.szip.SZIP;
import processing.core.PApplet;
import java.io.IOException;

public class MySketch extends PApplet {

    public void settings() {
        size(500, 500);
    }

    public void setup() {
         try {
            SZIP.archive("C:\\Users\\crowb\\OneDrive\\Рабочий стол\\example.zip", "C:\\Users\\crowb\\OneDrive\\Рабочий стол\\\\log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        PApplet.main("com.kingmang.szip.example.MySketch");
    }
}