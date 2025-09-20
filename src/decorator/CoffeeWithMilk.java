package decorator;

public class CoffeeWithMilk extends DecoratedCoffee {
    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Milk";
    }

    @Override
    public double getPrice() {
       return decoratedCoffee.getPrice() + 1.0 ;
    }
}
