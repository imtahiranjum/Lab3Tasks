import java.util.Scanner;

public class LAB2_Assignment2_Runner {
    public static void main(String[] args){
        Rectangle firstRectangle = new Rectangle();
        System.out.print("Please specify what you want to do: - (Press the given number to perform specific task)\nTO EXIT THE PROGRAM PRESS 0\n1. Set length\n2. Set width\n3. Get width\n4. Get length\n5. Get Area\n6. Display Details\n7. Clear Data\n\nPLEASE TYPE HERE: ");
        Scanner input= new Scanner(System.in);
        int choice = input.nextInt();

        while (choice != 0){
            switch (choice) {
                case 1 -> firstRectangle.setLength();
                case 2 -> firstRectangle.setWidth();
                case 3 -> firstRectangle.getLength();
                case 4 -> firstRectangle.getWidth();
                case 5 -> firstRectangle.getArea();
                case 6 -> firstRectangle.display();
                case 7 -> firstRectangle.clearData();
            }
            System.out.print("\n\nPlease specify what you want to do: - (Press the given number to perform specific task)\nTO EXIT THE PROGRAM PRESS 0\n1. Set length\n2. Set width\n3. Get width\n4. Get length\n5. Get Area\n6. Display Details\n7. Clear Data\n\nPLEASE TYPE HERE: ");
            choice = input.nextInt();
        }
    }
}
