import java.util.Scanner;

public class RectangleOfStars {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows (height): ");
        int rows = scanner.nextInt(); 

        System.out.print("Enter the number of columns (width): ");
        int columns = scanner.nextInt(); 

        
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= columns; j++) {
                System.out.print("*"); 
            }
            
            System.out.println();
        }

        
        scanner.close();
    }
}

