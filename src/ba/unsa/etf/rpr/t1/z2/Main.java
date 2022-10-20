package ba.unsa.etf.rpr.t1.z2;

import java.util.Scanner;

public class Main {
    static int sumaCifara(int broj) {
        int suma = 0;
        do {
            int c = broj % 10;
            suma = suma + c;
            broj = broj / 10;
        } while(broj != 0);
            return suma;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite zeljeni broj n: ");
        int n = s.nextInt();
        System.out.println("Brojevi od 1 do " + n + " koji su djeljivi sa sumom cifara su: ");
        for (int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i + " ");
        }
    }
}