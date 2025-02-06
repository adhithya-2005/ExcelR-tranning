public class Demo067 {
    public static void main(String[] args) {
        
        int[] array = {10, 21, 30, 43, 50, 61, 72};

        
        System.out.println("Even elements in the array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {  
                System.out.println(array[i]);
            }
        }
    }
}

