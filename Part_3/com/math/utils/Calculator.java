package com.math.utils;

import com.kg.geometry.Circle;
import com.kg.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Description");
        Circle cir= new Circle(5.5);
        Rectangle rec= new Rectangle(10,5);
        double cirArea = Math.PI*Math.pow(cir.radius, 2);
        double rectArea = rec.length* rec.width;
        System.out.println(cirArea);
        System.out.println(rectArea);

    }



}
