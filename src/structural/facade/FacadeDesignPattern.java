package structural.facade;
/*
       Facade pattern sistemin murekkebliyini istifadeciden gizledir
       ve sade API yaradir. Meselen: komputerin acilmasi ucun CPU, RAM, HDD kimi
       modullar ise dusur. Amma istifadeci yalniz startComputer() cagirir.
       Bu pattern kodu sadelesdirir.
       Facade pattern kompleks sistemi gizlədir və istifadəçiyə minimum metodlarla idarə etmə imkanı verir.
 */

public class FacadeDesignPattern {
    public static void main(String[] args) {
        Facade facade = new Facade(new Circle(), new Square());
        facade.drawAndFillCircle();
        facade.drawAndFillSquare();
    }
}

interface Shape{
    void draw();
    void fillWithColor();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle is drawing...");
    }

    @Override
    public void fillWithColor() {
        System.out.println("Circle filled with red color");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square is drawing...");
    }

    @Override
    public void fillWithColor() {
        System.out.println("Square filled with blue color");
    }
}

class Facade{
    private Circle circle;
    private Square square;

    public Facade(Circle circle, Square square) {
        this.circle = circle;
        this.square = square;
    }

    public void drawAndFillCircle(){
        circle.draw();
        circle.fillWithColor();
    }

    public void drawAndFillSquare(){
        square.draw();
        square.fillWithColor();
    }
}
