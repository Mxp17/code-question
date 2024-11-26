import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        
        if (a < b) {
            
            int temp = a;
            a = b;
            b = temp;
        }
   int gcd = 1;
             for (int i = 1; i <= b; i++) {
            
            if (a % i == 0 && b % i == 0) {
                gcd = i; 
            }
        }
        System.out.println("The GCD of " + a + " and " + b+ " is: " + gcd);
    scanner.close();
    }
}
