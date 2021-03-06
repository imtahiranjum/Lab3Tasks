
import java.util.Scanner;

public class Rectangle {
    private Double length;
    private Double width;
    private Double area;

    public void pause() {
        System.out.println("\nPress Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
    }

    public void setLength() {
        System.out.print("Please set length: ");
        Scanner input = new Scanner(System.in);
        length = input.nextDouble();
        if (length!=null & width!= null){
            setArea();
        }
        pause();
    }

    public void setWidth() {
        System.out.print("Please set width: ");
        Scanner input = new Scanner(System.in);
        width = input.nextDouble();
        if (length!=null & width!= null) {
            setArea();
        }
        pause();
    }

    public void getLength() {
        if (length != null) {
            System.out.print("Rectangle Length: " + length);
        } else {
            System.out.print("Length not specified");
        }

        pause();
    }

    public void getWidth() {
        if (width != null) {
            System.out.print("Rectangle Width: " + width);
        } else {
            System.out.print("Width not specified");
        }
        pause();
    }

    private void setArea(){
        area = width*length;
    }

    public void getArea(){
        if (area != null) {
            System.out.print("Rectangle Area: " + area);
        } else {
            System.out.print("Area not calculated due to insufficient data");
        }
        pause();
    }
    public void display(){
        System.out.println("\nLength: "+length+ "\nWidth :"+width+"\nArea: "+area);
        pause();
    }
    public void clearData(){
        length = null;
        width = null;
        area = null;
        System.out.print("\nData Cleared!");
        pause();
    }

}

