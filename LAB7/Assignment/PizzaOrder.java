package com.company;

public class PizzaOrder {
    public double firstPizza;
    public double secondPizza;
    public double thirdPizza;
    double totalCalculation;

    public PizzaOrder(Pizza pizza){
        firstPizza = pizza.calcCost();
    }
    public PizzaOrder(Pizza pizza, Pizza pizza2){
        firstPizza = pizza.calcCost();
        secondPizza = pizza2.calcCost();
    }
    public PizzaOrder(Pizza pizza, Pizza pizza2, Pizza pizza3){
        firstPizza = pizza.calcCost();
        secondPizza = pizza2.calcCost();
        thirdPizza = pizza3.calcCost();
    }

    public void calcTotal(){
            totalCalculation = firstPizza+secondPizza+thirdPizza;
        System.out.print("\nTotal price: "+totalCalculation+"$");
    }


}
