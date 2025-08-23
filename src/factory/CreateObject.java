package factory;

import factory.Factory.FactoryDesignPatternFirst;
import factory.Factory.FactoryDesignPatternSecond;
import factory.Factory.FactoryInterface;
import factory.FactoryAbstract.FactoryAbstractDesignPatternFirst;
import factory.FactoryAbstract.FactoryAbstractDesignPatternSecond;
import factory.FactoryAbstract.FactoryDesignAbstractClass;

public class CreateObject {
    public void createFactoryMethodDesign(String pattern){
        FactoryInterface designPattern;
        if (pattern.equalsIgnoreCase("Factory Design Pattern first")){
            designPattern = new FactoryDesignPatternFirst();
        }
        else if (pattern.equalsIgnoreCase("Factory Design Pattern second")){
            designPattern = new FactoryDesignPatternSecond();
        } else designPattern = new FactoryDesignPatternFirst();

        designPattern.factoryMethod();
    }

    public void createFactoryMethodAbstractDesign(String pattern){
        FactoryDesignAbstractClass designPattern;
        if (pattern.equalsIgnoreCase("Factory Abstract Design Pattern first")){
            designPattern = new FactoryAbstractDesignPatternFirst();
        }
        else if (pattern.equalsIgnoreCase("Factory Abstract Design Pattern second")){
            designPattern = new FactoryAbstractDesignPatternSecond();
        } else designPattern = new FactoryAbstractDesignPatternFirst();

        designPattern.factoryMethod();
    }
}
