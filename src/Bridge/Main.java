package Bridge;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.power();
        remoteControl.power();


        Radio radio = new Radio();
        VoiceControl voiceControl = new VoiceControl(radio);
        voiceControl.power();
        voiceControl.power();

    }
}
