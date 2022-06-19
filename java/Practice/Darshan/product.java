import java.io.*;
import java.util.Scanner;

class product {

    /* Function to get product of digits */
    static int getProduct(int n) {
        int product = 1;

        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }

        return product;
    }

    // Driver program
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getProduct(n));
    }
}