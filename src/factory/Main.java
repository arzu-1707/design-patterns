package factory;

public class Main {
    public static void main(String[] args) {
        CreateObject createObject = new CreateObject();

        //Factory Design Pattern
        createObject.createFactoryMethodDesign("Factory Design PATTern first");
        createObject.createFactoryMethodDesign("Factory DeSIgn PATTern first");
        createObject.createFactoryMethodDesign("Factory Design PATTern first");
        createObject.createFactoryMethodDesign("Factory Design PATTern SECOND");
        createObject.createFactoryMethodDesign("Factory Design PATTern second");
        System.out.println();

        System.out.println("----------------------------------------------------------------------");
        System.out.println();


        //Factory Abstract Design Pattern
        createObject.createFactoryMethodAbstractDesign("Factory Abstract Design Pattern FIRST");
        createObject.createFactoryMethodAbstractDesign("Factory Abstract Design PATTERN first");
        createObject.createFactoryMethodAbstractDesign("Factory Abstract Design Pattern SECOND");
        createObject.createFactoryMethodAbstractDesign("Factory Abstract Design Pattern second");
        createObject.createFactoryMethodAbstractDesign("Factory Abstract Design Pattern Second");










    }
}
