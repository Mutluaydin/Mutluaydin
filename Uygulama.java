package Devoir04;

import java.util.ArrayList;
import java.util.List;

public class Uygulama {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new ProductItem("Su", 0.25, 20));
        items.add(new ProductItem("Un", 0.9, 5));
        items.add(new ServiceItem("Paketleme", 2));

        Order order = new Order(items);
        order.printItems();
        System.out.println("--------------");
        System.out.println("Toplam = " + order.getTotalPrice());
    }
}
