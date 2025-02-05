public class Demo064 {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};

       
        if (arr.length > 1) {
           
            System.out.println("Original array:");
            printArray(arr);

           
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;

           
            System.out.println("Array after swapping 1st and last elements:");
            printArray(arr);
        } else {
            System.out.println("Array has less than 2 elements, cannot swap.");
        }
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
