package com.company;

public class Calculator {
    public static double sum;
    public static double multiply;
    public static double divide;
    public static double modulus;
    public static double sin;
    public static double cos;
    public static double tan;

    public static double sum(double x, double y){
        return x+y;
    }

    public static double multiply(double x, double y){
        return x*y;
    }

    public static double divide(double x, double y){
        return x/y;
    }

    public static double modulus(double x, double y){
        return x%y;
    }

    public static double sin(double x){
        return java.lang.Math.sin(x);
    }

    public static double cos(double x){
        return java.lang.Math.cos(x);
    }

    public static double tan(double x){
        return java.lang.Math.tan(x);
    }

}
