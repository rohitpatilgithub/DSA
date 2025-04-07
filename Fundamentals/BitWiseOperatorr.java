package Fundamentals;

public class BitWiseOperatorr {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("AND Operator " + (a & b));
        // How AND works here
        // 3 ( 011 )
        // 4 ( 100 )
        //   011
        // & 100
        //   000
        // Thus we get output : 0

        System.out.println("OR Operator " + (a | b));
        //How OR works here
        //   011
        // | 100
        //   111
        // Which is 7 in decimal
        // Thus we get output : 7

        System.out.println("NOT Operator " + (~a));
        //How NOT works here
        //   ~ ( 011 )

        // We know that int is of 4 bytes
        // 1 byte = 8 bits
        // 4 bytes = 8 * 4 = 32 bits
        // thus the very first bit in 32 bits is called set bit
        // ( which tells whether number is positive or negative )
        // If 0 then positive & 1 then negative

        // So our int a = 3 won't be just 011 but 00000000000000000000000000000011 instead
        // As we know in ~ we change the bit from 1 to 0 and vice versa
        // So our set bit will turn from 0 to 1 ( positive to negative )
        // +011 will be converted to -100
        // Which is -4 in decimal
        // Thus we get output : -4

        System.out.println("XOR Operator " + (a ^ b));
        // How XOR works here
        //   011
        // ^ 100
        //   111
        // Which is 7 in decimal
        // Thus we get output : 7
    }
}
