package com.company;

public class LAB6AssignmentRunner {

    public static void main(String[] args) {
        Pizza first = new Pizza("Medium", 2, 3,1);
        Pizza second = new Pizza("Medium", 5, 1,1);

        PizzaOrder firstOrder = new PizzaOrder(first, second);

        first.calcCost();
        second.calcCost();

        first.getDescription();
        second.getDescription();

        firstOrder.calcTotal();

    }
}
