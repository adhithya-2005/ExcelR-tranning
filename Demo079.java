public class Demo079 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int searchElement = 34;
        
        boolean found = false;
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Element " + searchElement + " is found in the array.");
        } else {
            System.out.println("Element " + searchElement + " is not found in the array.");
        }
    }
}
