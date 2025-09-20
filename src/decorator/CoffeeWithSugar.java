package decorator;

public class CoffeeWithSugar extends DecoratedCoffee{

    public CoffeeWithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Sugar";
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.5;
    }
}
