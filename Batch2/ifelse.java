package Batch2;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the age");
        int age = scan.nextInt();

        // if(age >= 18){
        //     System.out.println("Eligible");
        // }
        // else {
        //     System.out.println("Not Eligible");
        // }
        String eligibility = (age >= 18) ? "Eligible" : "Not Eligible" ; 
        System.out.println(eligibility);
    }
}
