import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        int i,j,r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

for(i=1;i<=r;i++)
{
int k=i;
for(j=1;j<=(r-i);j++)
{
System.out.print(" ");
}
for( ;j<=r;j++)
{
System.out.print(k);
k--;
}
k=1;
for( ;j<(r+i);j++)
{
k++;
System.out.print(k);
}
for( ;j<=(2*r-1);j++)
{
System.out.print(" ");
}
System.out.println();
}
    }
}
