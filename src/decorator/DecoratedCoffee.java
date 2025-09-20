package decorator;

import java.nio.charset.CoderMalfunctionError;

abstract class DecoratedCoffee implements Coffee{

    protected Coffee decoratedCoffee;

    public DecoratedCoffee(Coffee coffee){
        decoratedCoffee = coffee;
    }

}
