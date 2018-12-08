package cwiczeniaGrudzien2.tablicaWstawianieElementu;

public class MyList {

    // 1.0 Napisz implementację rozszerzalnej tablicy, do której można wstawić element w dowolne
// miejsce
// Implementacja może na początku tworzyć dużą przewymiarowaną tablicę (np. milion elementów)
// i operować na niej
// Wymaga się funkcji:
// pobierającej wielkość aktualnie wypełnionej tablicy,
// pobieranie elementu o podanym indexie wstawianie elementu przed podanym indexem.


    //tworzymy tablicę
    int[] myList = new int[1000000];
    int counter = 0;

    //pobieranie długości
    public int getLength() {
        return counter;
    }

    public int getElement(int index) {
        return myList[index];
    }

    public void insertElement(int index, int elemenet) {

        //tworzenie tymczasowej tablicy do skopiowania
        int[] temp = new int[counter - index];
        int tempIndex = 0;

        for (int i = index; i < counter; i++) {
            temp[tempIndex] = myList[i];
            tempIndex++;
        }

        myList[index] = elemenet;
        counter++;

        tempIndex = 0;
        for (int i = index + 1; i < counter; i++) {
            myList[i] = temp[tempIndex];
            tempIndex++;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < counter; i++) {
            result += i + ":" + myList[i] + "\n";
        }
        return result;
    }

    //ZADANIE 1.1 Napisz metode która z naszej implementacji tablicy odnajdzie element o zadanej wartosci i zwróci jego indeks

    public int findIndex(int value) {
        for (int i = 0; i < counter; i++) {
            if (value == myList[i]) {
                return i;
            }
        }
        return -1; //można to zamienić na throw exception (przykład poniżej)
    }

//    Zadanie 1.2 Zakładając, że dane w tablicy są zawsze posortowane, zmodyfikuj powyższą metodę tak,
// aby w przypadku braku elementu o dokładnej zadanej wartości zwracała index pierwszego większego elementu


    public int sortFindIndex(int value) throws Exception {
        for (int i = 0; i < counter; i++) {
            if (value == myList[i]) {
                return i;
            } if (myList[i] > value){
                return i;
            }
        }
        throw new Exception("Tablica jest pusta lub brak większej wartości");
    }

    //ZADANIE 1.3 Następnie używając metody wstawiania i wyszukiwania napisz implementację wstawiania,
    // która będzie zawsze utrzymywała tablicę w porządku posortowanym rosnąco.

    public void insertElementAndSort(int element){

        int index;
        try{
            index = sortFindIndex(element);
        }catch (Exception e){
            index = counter;
        }

        insertElement(index, element);
    }
}
