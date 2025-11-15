package structural.bridge;

public class TV implements Device {
    private boolean bool =false;

    @Override
    public void turnOn() {
        bool = true;
        System.out.println("TV acildi...");
    }

    @Override
    public void turnOff() {
        bool = false;
        System.out.println("TV sonduruldu...");
    }

    @Override
    public boolean isEnabled() {
        return bool;
    }
}
