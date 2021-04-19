package com.company;

import java.util.Scanner;

public class Publication {
    private String title;
    private double price;

    public Publication(){

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void display(){
        System.out.print("\nTitle: "+getTitle()+"\nPrice: "+getPrice());
    }
}
