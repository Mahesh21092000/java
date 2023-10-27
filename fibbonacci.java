public class fibbonacci {
    public static void main(String[] args) {
        int n=10,firstTerm=0,secoundTerm=1;
        System.out.println("fibbonacci Series till "+n+"terms");
        for(int i=1;i<=n;++i)
        System.out.println(firstTerm+",");
        int nextTerm=firstTerm+secoundTerm;
        firstTerm=secoundTerm;
        secoundTerm=nextTerm;
    }
}
