import java.util.Scanner;

public class L3_A2_Runner {
    public static void main(String[] args){
        System.out.print("\nPlease Enter hours: ");
        Scanner input = new Scanner(System.in);
        Time time = new Time();
        time.hours = input.nextInt();
        System.out.print("\nPlease Enter minutes: ");
        time.minutes = input.nextInt();
        System.out.print("\nPlease Enter seconds: ");
        time.seconds = input.nextInt();

        time.check();
        System.out.print("\nPlease Enter hours, minutes and seconds using comas: ");
        time.check(input.nextInt(), input.nextInt(),input.nextInt());

        time.display();
    }
}
