public class IntegerPalindram {
    public static void main(String[] args) {
        int r,temp,sum=0 ;
        int n=123454321;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("the given number is palindram ");
        else
        System.out.println("the given number is not palindram");


    }
    
}
