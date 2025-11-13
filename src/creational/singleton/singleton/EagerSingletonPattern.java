package creational.singleton.singleton;

public class EagerSingletonPattern {

    private static EagerSingletonPattern instance = new EagerSingletonPattern() ;

    private EagerSingletonPattern(){

    }

    public static EagerSingletonPattern getInstance(){
        return instance;
    }
}
