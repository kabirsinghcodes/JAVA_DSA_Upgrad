import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);

        System.out.println("Enter the dividend");
        int dividend = sc.nextInt();
        System.out.println("enter the divisor");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainderr = dividend % divisor;

        System.out.println("The Quotient and the remainder after dividing the two numbers is = "+quotient+ " & " +remainderr);

    }
}
