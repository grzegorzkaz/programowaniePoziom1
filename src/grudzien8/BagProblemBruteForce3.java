package grudzien8;

import java.util.Scanner;

public class BagProblemBruteForce3 {

    private static Element[] elements;
    private static int elementCount;
    private static Bag bag;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pojemność plecaka: ");
        bag = new Bag(scanner.nextInt());

        System.out.println("Wprowadź ilość elementów plecaka: ");
        elementCount = scanner.nextInt();
        elements = new Element[elementCount];

        for (int i = 0; i < elementCount; i++) {
            System.out.printf("Wprowadź wartość i wagę %d elementu: ", i + 1);
            elements[i] = new Element(
                    scanner.nextInt(),
                    scanner.nextInt());
//            elements[i].price = scanner.nextInt();
//            elements[i].weight = scanner.nextInt();
        }

        while (true) {
            try {
                bag.put(elements[findByPrice(bag)]);
            } catch (Exception e) {
                break;
            }
        }


        //poniżej klamra zamykająca main
    }

    private static int findByPrice(Bag bag) {
        int topPrice = 0;

        for (int i = 0; i < elementCount; i++) {
            if (bag.contains(elements[i])) {
                continue;
            }
            topPrice = i;
        }

        for (int i = 0; i < elementCount; i++) {
            if (bag.contains(elements[i])) {
                continue;
            }
            if (elements[topPrice].price < elements[i].price) {
                topPrice = i;
            }
        }
        return topPrice;
    }
}

