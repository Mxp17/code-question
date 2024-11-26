import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter marks in subject 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter marks in subject 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter marks in subject 3: ");
        int marks3 = scanner.nextInt();

        double average = (marks1 + marks2 + marks3) / 3.0;
        String grade = (average >= 90) ? "A+" :
                       (average >= 75) ? "A" :
                       (average >= 50) ? "B" : "Fail";

    
        System.out.println("The average marks are: " + average);
        System.out.println("The grade is: " + grade);

        
        scanner.close();
    }
}
