package binarydecimal;

import java.util.Scanner;

public class BinaryDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca un número que sea mayor que 0: ");
            n = sc.nextInt();
        } while (n < 0);

        System.out.print("\nBinario: ");
        decBin(n);
        System.out.println("");
    }

    public static void decBin(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
        }
    }
}
