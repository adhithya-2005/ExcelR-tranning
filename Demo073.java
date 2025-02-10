import java.util.HashSet;

public class Demo073 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};
        System.out.println("Duplicate elements in the array:");
        findDuplicates(arr);
    }

    
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

    

