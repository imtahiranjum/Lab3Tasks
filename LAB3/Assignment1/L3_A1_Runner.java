import java.util.Scanner;

public class L3_A1_Runner {
    public static void main(String[] args){

        Marks firstInstance = new Marks();
        Marks secondInstance = new Marks();

        System.out.print("\nPlease enter marks of subject1: ");
        Scanner input = new Scanner(System.in);
        firstInstance.subjectMarks1 = input.nextInt();

        System.out.print("\nPlease enter marks of subject2: ");
        firstInstance.subjectMarks2 = input.nextInt();

        System.out.println("\nPlease enter marks of subject3: ");
        firstInstance.subjectMarks3 = input.nextInt();

        System.out.println("Total marks of first student are: "+firstInstance.calculate());


        System.out.println("Total marks of second student are: "+secondInstance.calculate(20,30,40));
    }
}
