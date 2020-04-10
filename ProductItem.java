package Devoir04;

public class ProductItem extends Item{
    private double amount;
    private double pricePerUnit;

    public ProductItem(String description, double pricePerUnit, double amount){
        super(description);
        this.pricePerUnit = pricePerUnit;
        this.amount = amount;
    }

    @Override
    public double getPrice(){
        return pricePerUnit * amount;
    }
    @Override
    public void print(){
        System.out.println(getDescription() + " --- " + pricePerUnit + " * " + amount + " = " + getPrice());
    }
}
