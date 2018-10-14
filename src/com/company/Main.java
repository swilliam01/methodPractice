package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String shape = "";
        System.out.println("Enter the shape to calculate the area : ");
        shape = keyboard.nextLine();
        if (shape.equalsIgnoreCase("circle")){
            System.out.println("Enter a radius : ");
            double input = keyboard.nextDouble();
            double circle = circleArea(input);
            System.out.printf("%.2f",circle);
        }else if (shape.equalsIgnoreCase("triangle")){
            System.out.println("Enter base value :");
            double num = keyboard.nextDouble();
            System.out.println("Enter height value :");
            double num2 =keyboard.nextDouble();
            double triArea = triangleArea(num,num2);
            System.out.printf("%.2f",triArea);
        }else if (shape.equalsIgnoreCase("rectangle")){
            System.out.println("Enter length value :");
            double value = keyboard.nextDouble();
            System.out.println("Enter width value :");
            double value2 = keyboard.nextDouble();
            double recArea = rectangleArea(value,value2);
            System.out.printf("%.2f",recArea);
        }else if (shape.equalsIgnoreCase("square")){
            System.out.println("Enter a side :");
            double side = keyboard.nextDouble();
            double sqArea = squareArea(side);
            System.out.printf("%.2f",sqArea);
        }

    }

    public static double circleArea (double input){

        double cirArea = (input * input)* 3.14;

        return cirArea;
    }
    public static double triangleArea (double input,double input2){

        double triArea = (input*input2) / 2;

        return triArea;
    }

    public static double rectangleArea (double num,double num2){

        double recArea = num*num2;
        return recArea;
    }
    public static double squareArea (double input){

        double sqArea = (input * input);

        return sqArea;
    }
}