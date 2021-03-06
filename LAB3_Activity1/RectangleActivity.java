import java.util.Scanner;

public class RectangleActivity {
    private Double length;
    private Double width;

    public Double calculateArea(){
        return (length*width);
    }

    public void setLength(){
        System.out.print("Enter length: ");
        Scanner in = new Scanner(System.in);
        length = in.nextDouble();
    }

    public void setWidth(){
        System.out.print("Enter width: ");
        Scanner in = new Scanner(System.in);
        width = in.nextDouble();
    }
    public void display(){
        System.out.print("Length: "+length+"\nWidth: "+width+"Area: "+calculateArea());
    }
}
