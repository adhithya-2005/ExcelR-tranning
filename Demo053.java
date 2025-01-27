import java.util.Scanner;

public class Demo053 {
    
    
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int sum = 0;
        
        
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        
        if (originalNum == sum) {
            System.out.println(originalNum + " is a strong number.");
        } else {
            System.out.println(originalNum + " is not a strong number.");
        }

        scanner.close();
    }
}
