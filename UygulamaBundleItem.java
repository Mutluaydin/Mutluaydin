package Devoir04;

import java.util.ArrayList;
import java.util.List;

public class UygulamaBundleItem {
    public static void main(String[] args) {

        List<Item> itemsBundle = new ArrayList<>();
        itemsBundle.add(new ProductItem("Sucuk", 20, 2));
        itemsBundle.add(new ProductItem("peynir", 10,1));


        List<Item> items = new ArrayList<>();
        items.add(new BundleItem("Haftasonu indirimi ", itemsBundle, 5));



        Order orderBundle = new Order(items);
        orderBundle.printItems();
        System.out.println("--------------");
        System.out.println("Toplam = " + orderBundle.getTotalPrice());
    }
}
