package creational.factory;

/*
    Factory Method pattern — obyektlərin yaradılmasını alt class-lara
     həvalə edən Creational dizayn nümunəsidir.
 */

public class FactoryDesignPattern{

    public static void main(String[] args) {
        Shape square = createObj("square");
        Shape circle = createObj("circle");
        square.draw();
        circle.draw();
    }

    public static Shape createObj(String type){
        if (type.equalsIgnoreCase("square")){
            return new Square();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }

        return null;
    }
}

 interface Shape {
     void draw();
}

 class Square implements Shape {
    @Override
    public void draw() {
        System.out.print("Square is drawing...");
    }
}

 class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle is drawing...");
    }
}



