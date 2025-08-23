import builder.BuilderDesignPattern;
import singleton.EagerSingletonPattern;
import singleton.LazySingletonPattern;

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

        EagerSingletonPattern eagerSingletonPattern1 = EagerSingletonPattern.getInstance();
        EagerSingletonPattern eagerSingletonPattern2 = EagerSingletonPattern.getInstance();

       // System.out.println(eagerSingletonPattern1);
        //System.out.println(eagerSingletonPattern2);

        LazySingletonPattern lazySingletonPattern1 = LazySingletonPattern.getInstance();
        LazySingletonPattern lazySingletonPattern2 = LazySingletonPattern.getInstance();

      //  System.out.println(lazySingletonPattern1);
       // System.out.println(lazySingletonPattern2);


    }
}