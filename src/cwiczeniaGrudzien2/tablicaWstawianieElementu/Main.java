package cwiczeniaGrudzien2.tablicaWstawianieElementu;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        MyList list = new MyList();

        System.out.println(list);

        list.insertElement(0,3);
        list.insertElement(1,5);
        list.insertElement(2,7);

        System.out.println(list);

        //ZADANIE 1.1
        System.out.println("Podaję indeks dla wartości 5: ");
        System.out.println("indeks: " + list.findIndex(5) + "\n");

        //ZADANIE 1.2
        System.out.println(list.sortFindIndex(4));

        //ZADANIE 1.3
        System.out.println("Dodaje i sortuje elementy");

        list.insertElementAndSort(43);
        list.insertElementAndSort(4);
        list.insertElementAndSort(999);
        list.insertElementAndSort(343);
        list.insertElementAndSort(2);
        list.insertElementAndSort(5);

        System.out.println(list);

        //ZADANIE 1.4 Zmierz czas dodania 10.000 losowych elementow do tablicy
        System.out.println("Czas dodatnia losowych elementów");
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i <10000; i++){
            list.insertElementAndSort(random.nextInt());
        }

        long stopTime = System.nanoTime();
        double elapsedTime = (stopTime - startTime) / 1_000_000.0d;
        System.out.println(list);
        System.out.println(elapsedTime);

    }
}
