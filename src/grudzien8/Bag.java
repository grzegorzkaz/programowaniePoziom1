package grudzien8;

import java.util.Arrays;

public class Bag {
    private int bagCapacity;
    private int currentBagWeight;
    private int currentBagPrice;
    private Element[] bagElements = new Element[512];
    private int elementCount = 0;

    public Bag(int bagCapacity) {
        this.bagCapacity = bagCapacity;
    }

    public void put (Element element)throws Exception{
        if (bagCapacity - currentBagWeight > element.weight){
            bagElements[elementCount] = element;
            elementCount++;
            currentBagWeight += element.weight;
            currentBagPrice += element.price;

        }else {
            throw new Exception("No space left");
        }
    }

    public boolean contains(Element element){
        return Arrays.asList(bagElements).contains(element);
    }

    @Override
    public String toString() {
        String bagSummary = "bagCapcity: " + bagCapacity;
        bagSummary += "\n elementCount: " + elementCount;
        bagSummary += "\n currentBagWeight: " + currentBagWeight;
        bagSummary += "\n currentBagPrice: " + currentBagPrice;

        return bagSummary;
    }
}
