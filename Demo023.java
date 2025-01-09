public class Palindrome {

    
    public static int isPalindrome(int number) {
        
        if (number <= 0) {
            return -1;
        }
        
        int originalNumber = number;
        int reversedNumber = 0;
        
       
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number /= 10; 
        }
        
        
        if (originalNumber == reversedNumber) {
            return 1; 
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(isPalindrome(232));  
        System.out.println(isPalindrome(345)); 
        System.out.println(isPalindrome(-232)); 
        System.out.println(isPalindrome(0)); 
        System.out.println(isPalindrome(12321)); 
    }
}
