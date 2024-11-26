import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount P ");
        double p = scanner.nextDouble();

        System.out.print("Enter the rate of interest R ");
        double r = scanner.nextDouble();

        System.out.print("Enter the time in years T ");
        double t = scanner.nextDouble();

        
        double si = (p * r * t) / 100;

    
        System.out.println("The Simple Interest SI is: " + si);

        
        scanner.close();
    }
}

