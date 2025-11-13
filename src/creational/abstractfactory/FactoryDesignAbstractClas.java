package creational.abstractfactory;

 class FactoryDesignAbstractClas {
     public static void main(String[] args) {
         BlueCircle blueCircle = new BlueCircle();
         blueCircle.draw().draw();
         blueCircle.fill().fill();
         System.out.println("-----------------------");
         RedSquare redSquare = new RedSquare();
         redSquare.draw().draw();
         redSquare.fill().fill();
     }


}


abstract class Shape{
    abstract void draw();
}

abstract class Color{
    abstract void fill();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Circle is drawing...");
    }
}

class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Square is drawing...");
    }
}

class Red extends Color {


    @Override
    void fill() {
        System.out.println("Fill with red color");
    }
}

class Blue extends Color {


    @Override
    void fill() {
        System.out.println("Fill with blue color");
    }
}

abstract class AbstractFactoryClass{
    abstract Shape draw();
    abstract Color fill();
}

class BlueCircle extends AbstractFactoryClass{

    @Override
    Shape draw() {
        return new Circle();
    }

    @Override
    Color fill() {
        return new Blue();
    }
}

class RedSquare extends AbstractFactoryClass{

    @Override
    Shape draw() {
        return new Square();
    }

    @Override
    Color fill() {
        return new Red();
    }
}


