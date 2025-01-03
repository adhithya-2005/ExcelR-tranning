import java.util.Scanner;
public class Demo007{
    public static void main(String[] args){
        String name;
        int age;
       long phno;
       // System.out.println("plz enter ur name, age,phone no");
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter ur name");
        name = sc.nextLine();
        System.out.println("plz enter ur age");
        age = sc.nextInt();     
        System.out.println("plz enter ur phone no");
        phno = sc.nextLong();
        System.out.println("Hello"+name + "ur age is "+age + "ur phone no is" +phno);

    }
}