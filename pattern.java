public class pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k );
            }
            for(int m=2;m<=i;m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
    }

