package cwiczeniaGrudzien2.CompanyLista;

import java.util.Random;

public class Main {

// 1.0 Napisz implementację rozszerzalnej tablicy, do której można wstawić element w dowolne
// miejsce
// Implementacja może na początku tworzyć dużą przewymiarowaną tablicę (np. milion elementów)
// i operować na niej
// Wymaga się funkcji:
// pobierającej wielkość aktualnie wypełnionej tablicy,
// pobieranie elementu o podanym indexie wstawianie elementu przed podanym indexem.

    public static void main(String[] args) throws Exception {

        MyList list = new MyList();
        System.out.println(list);

        //Zmierz czas dodania 10_000 losowych elementów do tablicy.
        Random random = new Random();

        long startTime = System.nanoTime();

        for (int i = 0; i < 10_000; i++) {
            list.sortInsertElement(random.nextInt(100000));
        }

        long stopTime = System.nanoTime();
        double elapsedTime = (stopTime - startTime)/1_000_000.0d;

        System.out.println(list);

        System.out.println(elapsedTime);
        System.out.println("insertTime: " + list.insertTime);
        System.out.println("sortTime: " + list.sortTime);



//        try {
//            System.out.println(list.sortFindIndex(2));
//            System.out.println(list.findIndex(7777));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        list.insertElementAndSort(0);
//        System.out.println(list);

    }
}
