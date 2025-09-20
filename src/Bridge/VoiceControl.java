package Bridge;

public class VoiceControl implements Remote{
    private Device device;

    public VoiceControl(Device device){
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.turnOff();
        } else device.turnOn();
    }
}
