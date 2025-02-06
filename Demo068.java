public class Demo068 {
    public static void main(String[] args) {
        
        int[] array = {10, 21, 30, 43, 50, 61, 72};

        
        int evenCount = 0;

        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {  
                evenCount++;  
            }
        }

        
        System.out.println("Count of even numbers: " + evenCount);
    }
}

    

