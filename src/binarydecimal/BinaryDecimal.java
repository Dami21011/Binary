package binarydecimal;

import java.util.Scanner;

public class BinaryDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        double n;
        do {
            System.out.print("Introduzca un número que sea mayor que 0 y menor que 256: ");
            n = sc.nextDouble();
            
            num =  (int) n;
            if (num <= 0 || num > 255) {
                System.out.println("te has equivocao maquina");
            }
            if (num < n){
            System.out.println("¿Cómo pones comas soplagaitas?");
            }
        } while (num <= 0 || num > 255 || num < n);
        
        System.out.print("\nBinario: ");
        decBin(num);
        System.out.println("");
    }

    public static void decBin(int num) {
        if (num <= 1) {
            System.out.print(num);
        } else {
            decBin(num / 2);
            System.out.print(num % 2);
        }
    }
}
