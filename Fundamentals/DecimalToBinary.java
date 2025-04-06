package Fundamentals;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        // Decimal to Binary

        // Not an optimized code!!

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal number : ");
        int inp = sc.nextInt();
        String res = "";

        while(inp > 0){
            int rem = inp % 2;
            inp /= 2;
            res = rem + res;
        }

        System.out.println("Result : "+res);
    }
}
