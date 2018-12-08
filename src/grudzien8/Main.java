package grudzien8;

import java.util.Scanner;

public class Main {
    public static int[][] storage = new int[512][512];

    //Polecenia zadań i wzory funkcji matematycznych w prezentacj

    public static void main(String[] args) {

        //Silnia:
        int n = 9;
        System.out.printf("Silnia od %d: %d", n, silnia(n));
        //  System.out.println(silnia(5));

        //sNweton
        System.out.println(sNewton(7, 5));

        //Pascal Tree
        System.out.println("\nPascal Tree. Podaj liczbę poziomów: ");
        pascalTree();
    }


    //funkcja do obliczania silni
    public static int silnia(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * silnia(n - 1);
    }

    //funkcja sNewton
    //dynamiczne programowanie - tzn. nie liczy od samego początku, tylko od ostatniej wartości
    public static int sNewton(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        if (storage[n][k] != 0){
            return storage[n][k];
        }
        return storage[n][k] = sNewton(n - 1, k - 1) + sNewton(n - 1, k);
    }

    //funkcja pascalTree
    public static void pascalTree() {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(sNewton(i, k) + " ");
            }
            System.out.println();
        }
    }
}




