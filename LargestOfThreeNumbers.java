import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int a=sc.nextInt();
        System.out.println("enter the value");
        int b=sc.nextInt();
        System.out.println("enter the value");
        int c=sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("the a is greater number");
        }if(b>=a && b>=c )
        {
            System.out.println("the b is the greater");
        }
        if(c>=a && c>=b)
        {
         System.out.println("c is the greater number");
        }
    }
    
}
