package cwiczeniaGrudzien2;

public class Zadanie3Rozwiazanie {

    public static void main(String[] args) {
        //3) Dana jest tablica liczb całkowitych, wypisz:
        int[] numbers = new int[]{1,1,1,1,1,321,32,13,21,32,1,2,245,2,1,5};
        //a) wszystkie po kolei
                //for each: "wartość każdego z elementów tablicy numbers przypisz do zmiennej x i wykonaj print"
                //używane jeżeli do wszystkich elementów danej tablicy wykonujemy to samo polecenie
                // w tym przypadku do wszystkich elementów stosunejmy print
        for (int x : numbers) {
            System.out.println(x);
        }

        System.out.println();

        //b) wszystkie od końca
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println();
        //c) wszystkie na nieparzystych pozycjach
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }

        //d) wszystkie podzielne przez 3
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
        }

        //e) sumę wszystkich
        System.out.println("Suma:");
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        System.out.println(sum);

        //f) sumę pierwszych 4
        sum = 0;
        for (int i = 0;  i < numbers.length; i++) {
            sum += numbers[i];
            if (i == 3) {
                break;
            }
        }
        System.out.println(sum);

        //g) sumę ostatnich 5 większych od 2
        sum = 0;
        int limit = 5;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > 2) {
                sum += numbers[i];
                limit--;
            }
            if (limit == 0) {
                break;
            }
        }
        System.out.println(sum);


        //h) ilość liczb idąc od początku tablicy, by ich suma przekroczyła 10
        int counter = 0;
        sum = 0;
        for (int i = 0;  i < numbers.length; i++) {
            counter++;
            sum += numbers[i];
            if (sum > 10) {
                break;
            }
        }
        System.out.println(counter);


    }
}



