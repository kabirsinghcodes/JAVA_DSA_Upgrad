import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the age");

        int age = sc.nextInt();

        String eligibility = (age>=18) ? "Eligible" : "Not Eligible";

        System.out.println(eligibility);

    }
}
