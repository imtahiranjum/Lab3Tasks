package com.company;

import java.util.Scanner;

public class LAB8_Q1_Runner {

    public static void main(String[] args) {
        Tape first_ = new Tape();
        Book first = new Book();
        System.out.print("Enter Title of Book: ");
        Scanner input = new Scanner(System.in);
        first.setTitle(input.next());
        System.out.print("Enter Price of Book: ");
        first.setPrice(input.nextDouble());
        System.out.print("Enter pages of Book: ");
        first.setPageCount(input.nextInt());
        System.out.print("Enter play time of Book: ");
        first_.setPlayingTime(input.nextDouble());
        first.display();
        first_.display();
    }
}
