package Devoir04;

import java.util.List;

public class Order {

    List<Item> items;

    public Order(List<Item> items){
        this.items = items;
    }

    public double getTotalPrice(){
        double total = 0;
        for (int i = 0 ; i < items.size(); i++){
            total += items.get(i).getPrice();
        }
        return total;
    }
    public void printItems(){
        for (int i = 0 ; i < items.size(); i++){
            items.get(i).print();
        }

    }
}
