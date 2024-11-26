import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        if (a % 5 == 0) {
            System.out.println(a + " is divisible by 5.");
        } else {
            System.out.println(a + " is not divisible by 5.");
        }
        scanner.close();
    }
}

