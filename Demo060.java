public class Demo060 {
    public static void main(String[] args) {
        int n = 20; 
        long first = 0, second = 1, next;

        
        System.out.print("Fibonacci Series of " + n + " numbers: ");
        
        
        System.out.print(first + " ");
        
        
        System.out.print(second + " ");
        
        
        for (int i = 3; i <= n; i++) {
            next = first + second; 
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}
