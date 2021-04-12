package com.company;

public class Pizza {
    private String size;
    private int numCheeseTopping;
    private int numPepperoniTopping;
    private int numHamTopping;

    public Pizza(){
    }

    public Pizza(String size, int numCheeseTopping, int numHamTopping, int numPepperoniTopping){
        this.numCheeseTopping = numCheeseTopping;
        this.numHamTopping = numHamTopping;
        this.numPepperoniTopping = numPepperoniTopping;
        this.size = size.toUpperCase();
    }

    public void setNumCheeseTopping(int numCheeseTopping) {
        this.numCheeseTopping = numCheeseTopping;
    }

    public void setNumHamTopping(int numHamTopping) {
        this.numHamTopping = numHamTopping;
    }

    public void setNumPepperoniTopping(int numPepperoniTopping) {
        this.numPepperoniTopping = numPepperoniTopping;
    }

    public void setSize(String size) {
        size = size.toLowerCase();
        if (size.equals("small") || size.equals("medium") || size.equals("large")){
            this.size = size.toUpperCase();
        }
    }

    public int getNumCheeseTopping() {
        return numCheeseTopping;
    }

    public int getNumHamTopping() {
        return numHamTopping;
    }

    public int getNumPepperoniTopping() {
        return numPepperoniTopping;
    }

    public String getSize() {
        return size;
    }

    public double calcCost(){
        int costSmall = 10;
        int costMedium = 12;
        int costLarge = 14;
        int totalTopping = (getNumCheeseTopping()*2) + (getNumHamTopping()*2) + (getNumPepperoniTopping()*2);
        int total;

        if (size.equals("MEDIUM")){
            total = costMedium + totalTopping;
            return total;
        }
        if (size.equals("LARGE")){
            total = costLarge + totalTopping;
            return total;
        }
        if (size.equals("SMALL")){
            total = costSmall + totalTopping;
            return total;
        }
        else
            return 0;
    }
    public void getDescription(){
        System.out.print("\n---------Pizza Details---------\n\nSize:  "+size+"\nToppings:-\nHam Topping: "+getNumHamTopping()+"\nPepperoni Topping: "+getNumPepperoniTopping()+"\nCheese Topping: "+getNumCheeseTopping()+"\n\nTotal Cost: "+calcCost()+"\n");
    }
}
