public class Demo070 {
    public static void main(String[] args) {
       
        int[] numbers = {3, 10, 13, 17, 20, 25, 29, 30};
        
        
        System.out.println("Prime numbers in the array are:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

   
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
}
}

