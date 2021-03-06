import java.util.Scanner;

public class LAB2_Assignment1Runner {
    public static void main(String[] args){
        Car firstCar = new Car();
        System.out.print("Please specify what you want to do: - (Press the given number to perform specific task)\nTO EXIT THE PROGRAM PRESS 0\n1. Set car company\n2. Set car model\n3. Set car color\n4. Get car company\n5. Get car model\n6. Get car color\n7. Display Details\n8. Clear Data\n\nPLEASE TYPE HERE: ");
        Scanner input= new Scanner(System.in);
        int choice = input.nextInt();

        while (choice != 0){
            switch (choice) {
                case 1 -> firstCar.setCompany();
                case 2 -> firstCar.setModel();
                case 3 -> firstCar.setColor();
                case 4 -> firstCar.getCompany();
                case 5 -> firstCar.getModel();
                case 6 -> firstCar.getColor();
                case 7 -> firstCar.display();
                case 8 -> firstCar.clearData();
            }
            System.out.print("\n\nPlease specify what you want to do: - (Press the given number to perform specific task)\nTO EXIT THE PROGRAM PRESS 0\n1. Set car company\n2. Set car model\n3. Set car color\n4. Get car company\n5. Get car model\n6. Get car color\n7. Display Details\n8. Clear Data\n\nPLEASE TYPE HERE: ");
            choice = input.nextInt();
        }
    }
}
