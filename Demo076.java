public class Demo076{
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        
        if (arr.length < 2) {
            System.out.println("Array doesn't have enough elements");
            return;
        }
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum element found.");
        } else {
            System.out.println("Second maximum number is: " + secondMax);
        }
    }
}

