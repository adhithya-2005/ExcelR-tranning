public class Demo078 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 7, 8, 45, 56, 89, 32};
        int n = arr.length;
        
        
        int[] even = new int[n];
        
        int[] odd = new int[n];
        
        int evenCount = 0;
        int oddCount = 0;
        
       
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evenCount++] = arr[i];
            } else {
                odd[oddCount++] = arr[i];
            }
        }
        
        
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        
        
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
 
    

