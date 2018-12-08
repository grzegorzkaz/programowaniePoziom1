package cwiczeniaGrudzien2;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        //napisz metodę, która sprawdza pełnoletniość danej osoby

        System.out.println("Podaj wiek");

        Scanner skaner = new Scanner(System.in);

        int wiek = skaner.nextInt();

        if (wiek >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("nie jesteś pełnoletni");
        }



    }


}
