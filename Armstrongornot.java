public class Armstrongornot {
    public static void main(String[] args) {
        int number=375,OriginalNumber,remainder,result=0;
        OriginalNumber = number ;
       
        while(OriginalNumber !=0)
        {
             remainder = OriginalNumber % 10 ;
             result +=Math.pow(remainder,3);
             OriginalNumber /=10;
        }
        if(result == number)
        System.out.println("the given number is armstrong number");
        else
        System.out.println("the given number is not armstrong number");



    }
    
}
