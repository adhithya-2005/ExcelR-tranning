public class Demo080 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34};
        int first = arr[0];
        
        
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        
        
        arr[arr.length - 1] = first;
        
        
        System.out.print("Array after shifting elements to left: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

