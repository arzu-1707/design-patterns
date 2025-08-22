//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //-------------------------------------------------------Builder Pattern

        BuilderDesignPattern designPattern = new BuilderDesignPattern.Builder().id(1)
                .stringField("Salam")
                .doubleField(1d).build();

        //System.out.println(designPattern);



        //-------------------------------------------------------Singleton Pattern

        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        //System.out.println(singletonPattern);
        //System.out.println(singletonPattern2);



    }
}