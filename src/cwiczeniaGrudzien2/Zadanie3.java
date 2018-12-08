package cwiczeniaGrudzien2;

public class Zadanie3 {

    public static void main(String[] args) {

//        3) Dana jest tablica liczb całkowitych, wypisz:
//        c) wszystkie na nieparzystych pozycjach
//        d) wszystkie podzielne przez 3
//        e) sumę wszystkich
//        f) sumę pierwszych 4
//        g) sumę ostatnich 5 większych od 2
//        h) ilość liczb idąc od początku tablicy, by ich suma przekroczyła 10

        int[] numbers = new int[]{1,2,4,7,8,11,20,25,26,28};

//        a) wszystkie po kolei
        System.out.println("Wypisuje wszystkie liczby po kolei");
        for (int x : numbers){
            System.out.println(x);
        }

        System.out.println("\n");

//        b) wszystkie od końca
        System.out.println("Wypisuje wszystkie liczby od konca");
        for (int i = numbers.length - 1; i >= 0; i-- ){
            System.out.println(numbers[i]);
        }
    }
}
