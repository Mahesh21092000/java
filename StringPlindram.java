public class StringPlindram {
    public static void main(String[] args) {
        String str = "Maham" , reverseStr="";
        int StrLength = str.length();
        for(int i =(StrLength-1);i>=0;--i){
            reverseStr = reverseStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str+"is the  Palindram String");
        }
        else{
            System.out.println(str+"is the string is not palindram");
        }
    }
}
