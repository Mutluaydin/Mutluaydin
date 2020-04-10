package Devoir04;

import java.util.List;

public class BundleItem extends Item{
    private double discount;
    private List<Item> items;

    public BundleItem(String label, List<Item>items, double discount){
        super(label);
        this.items = items;
        this.discount = discount;
    }

    @Override
    public double getPrice(){
        double total = 0.0;
        for (int i=0; i < items.size(); i++){
            total += items.get(i).getPrice();
        }
        return total - (total * discount) / 100;
    }

    @Override
    public void print(){
        for (int i = 0 ; i < items.size(); i++){
            items.get(i).print();
        }
        System.out.println(getDescription() + " --- " + discount + " % " +  " = " + getPrice());
    }
}
