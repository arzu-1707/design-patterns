package Bridge;

public class RemoteControl implements Remote{

    private Device device;

    public RemoteControl(Device device){
        this.device = device;
    }
    @Override
    public void power() {
        if (device.isEnabled()) {device.turnOff();}
        else {
            device.turnOn();
        }
    }
}
