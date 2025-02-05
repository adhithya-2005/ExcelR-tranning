class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Demo054 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        
        System.out.println("Sum of 5 and 10: " + calculator.add(5, 10));
        
        
        System.out.println("Sum of 5.5 and 10.5: " + calculator.add(5.5, 10.5));
        
        
        System.out.println("Sum of 1, 2, and 3: " + calculator.add(1, 2, 3));
    }
}
