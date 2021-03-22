package com.company;

public class Fraction {
    private int x;
    private int y;

    public Fraction(){
        x = 1;
        x = 5;
    }

    public Fraction(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void display() {
        double fraction;
        fraction = (double) x / (double) y;
        System.out.print(equals_z(23.2));
        System.out.println("Ratio =: " + fraction);
    }

    public boolean equals_z(double fraction) {
        double fraction_z;
        fraction_z = x / y;
        return fraction_z == fraction;
    }
}
