import java.util.Objects;
import java.util.Scanner;

public class Car {
    private String color;
    private String model;
    private String company;

    public void pause(){
        System.out.println("\nPress Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
    }

    public void setModel(){
        System.out.print("Please specify car model: ");
        Scanner input = new Scanner(System.in);
        model = input.next();
        pause();

    }
    public void setColor(){
        System.out.print("Please specify car color: ");
        Scanner input = new Scanner(System.in);
        color = input.next();
        pause();
    }
    public void setCompany(){
        System.out.print("Please specify car company: ");
        Scanner input = new Scanner(System.in);
        company = input.next();
        pause();
    }

    public void getColor(){
        if (color!=null){
            System.out.print("Car Color: "+color);
        }
        else {
            System.out.print("Car color not specified");
        }
        pause();
    }
    public void getModel(){
        if (model!=null){
            System.out.print("Car Model: "+model);
        }
        else {
            System.out.print("Car model not specified");
        }
        pause();
    }
    public void getCompany(){
        if (company!=null){
            System.out.print("Car company: "+company);
        }
        else {
            System.out.print("Car company not specified");
        }
        pause();
    }

    public void display(){
        System.out.println(Objects.requireNonNullElse("\nCar Company:\t"+company+ "\nCar Model:\t"+model+"\nCar Color:\t" +color, "You are missing some information"));
        pause();
        }

    public void clearData(){
        color = null;
        model = null;
        company = null;
        System.out.print("\nData Cleared!");
        pause();
    }

    }
