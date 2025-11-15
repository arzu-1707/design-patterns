package structural.bridge;

public class Radio implements Device{

    private boolean bool =false;

    @Override
    public void turnOn() {
        bool = true;
        System.out.println("Radio acildi...");
    }

    @Override
    public void turnOff() {
        bool= false;
        System.out.println("Radio sonduruldu...");
    }

    @Override
    public boolean isEnabled() {
        return bool;
    }
}
