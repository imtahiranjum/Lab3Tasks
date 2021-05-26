package com.company;

import java.util.Scanner;


public class LAB11_Assignment_Runner {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Shape[] first = new Shape[100];
        first[0] = new Circle(5.6);
        first[1] = new Triangle(7.1, 3.2);
        first[2] = new Rectangle(6.3, 7.9);

        CalculateAreas second = new CalculateAreas(first);
        second.calArea();
        System.out.println(second.toString());


    }

}
