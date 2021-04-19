package Question2;

public class Laptop extends Computer {
    private double width;
    private double length;
    private double height;
    private double weight;

    public Laptop(){
        super();
        weight = 100;
        length = 25;
        height = 16;
        width = 5;
    }

    public Laptop(double weight, double width, double height, double length){
        super();
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.length = length;

    }
    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void display(){
        System.out.print("Length: "+length+"\nWeight: "+weight+"\nWidth: "+width+"\nHeight: "+height);
    }
}
