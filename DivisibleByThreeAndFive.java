import java.util.Scanner;

public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = (number % 3 == 0 && number % 5 == 0) ? 
                        number + " is divisible by both 3 and 5." : 
                        number + " is not divisible by both 3 and 5.";
        System.out.println(result);   
        scanner.close();
    }
}

