package decorator;

import java.net.CookieHandler;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new SimpleCoffee();
        System.out.println(coffee1.getDescription()+ "    " + coffee1.getPrice());

        System.out.println("--------------------------------------------------------");
        Coffee coffee2 = new CoffeeWithMilk(coffee1);
        System.out.println(coffee2.getDescription() + "    " + coffee2.getPrice());


        System.out.println("--------------------------------------------------------");
        Coffee coffee3 = new CoffeeWithSugar(coffee2);
        System.out.println(coffee3.getDescription() + "     " + coffee3.getPrice());
    }
}
