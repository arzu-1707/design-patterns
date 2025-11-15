package structural.adapter;

/* Iki uygun olmayan obyektlerin bir biri ile isleye bilmesi ucun
    adapter sinfi yaradilir...
    Adapter pattern iki uygun olmayan interface-i bir-birine uygunlasdirmaq ucun
    istifade olunur... Meselen bir obyekt yalniz Text formatinda isleyir..
    amma bizde melumat voice formatindadir.. Bu zaman adapter text formatini voice
    formatina cevirir ve obyekt rahat isleyir... Adapter problemi hell edir ki, kohne
    kodu deyismeden yeni sisteme uygunlasdiraq...
 */

public class AdapterPattern {

    public static void main(String[] args) {
        Voice voice = new VoiceImpl();

        Text text = new TextImpl();

        Text adapter = new AdapterToText(voice);
        adapter.shareMessage(adapter.textMessage());

        Voice adapterVoice = new AdapterToVoice(text);
        adapterVoice.shareMessage(adapterVoice.voiceMessage());
    }
}

interface Text{
    String textMessage();
    void shareMessage(String data);
}

interface Voice{
    String voiceMessage();
    void shareMessage(String data);
}

class TextImpl implements Text{
    @Override
    public String textMessage() {
        return "Text message";
    }

    @Override
    public void shareMessage(String data) {
        System.out.println(data + " olaraq gonderildi...");
    }
}

class VoiceImpl implements Voice{

    @Override
    public String voiceMessage() {
        return "Voice message";
    }

    @Override
    public void shareMessage(String data) {
        System.out.println(data + " olaraq gonderildi...");
    }
}

class AdapterToText implements Text{
    private String message;
    private Voice voice;

    public AdapterToText(Voice voice) {
        this.voice = voice;
    }


    @Override
    public String textMessage() {
        return voice.voiceMessage() + " text metnine cevrildi..";
    }

    @Override
    public void shareMessage(String data) {
        System.out.println(data + " text metni olaraq paylasildi...");;
    }
}

class AdapterToVoice implements Voice{
    private String message;
    private Text text;

    public AdapterToVoice(Text text) {
        this.text = text;
    }


    @Override
    public String voiceMessage() {
        return text.textMessage() +" voice cevrildi...";
    }

    @Override
    public void shareMessage(String data) {
        System.out.println(data + " voice olaraq paylasildi...");
    }
}
