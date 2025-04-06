package Fundamentals;

import java.util.Scanner;

public class BitWiseOperator {
    public static void main(String[] args) {

        // Bitwise operators performs operations at bit level in system
        // Bitwise operators are as follows :
        // ( AND operator )    & ( Until both are true 1 & 1 = 1 )
        // ( OR operator )     | ( At least One must be true 1 | 0 = 1 )
        // ( NOT operator )    ~ ( Opposite ~1 = 0 )
        // ( XOR operator )    ^ ( If both are same 1 ^ 1 = 0 , 0 ^ 0 = 0 )

        // Bit operators are faster than Arithmetic operators

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int a = sc.nextInt();

        // Time taken by arithmetic operator to know whether number is even or not
        var start = System.nanoTime();
        if(a % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        var end = System.nanoTime();
        System.out.println("Time taken by arithmetic operator : "+(end - start));

        // Time taken by Bit wise operator
        start = System.nanoTime();
        if((a & 1) == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        end = System.nanoTime();
        System.out.println("Time taken by Bit wise operator : "+(end - start));

        // How does our logic work
        // 3 in binary ( 011 )
        // Last digit is 1
        // Using '&' Operator to find whether final bit is 1 / 0
        // 011
        // & 1
        // 001

        // List bit is 1 thus it is odd
    }
}
