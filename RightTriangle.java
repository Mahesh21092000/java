public class RightTriangle {
    public static void main(String[] args) {
        int n = 6,i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(j=i;j<=n;j++){
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
