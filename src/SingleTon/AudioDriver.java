package SingleTon;

public class AudioDriver {

    private static AudioDriver audioDriver = null;
    String s;
    private AudioDriver(){
        s ="I'm an Audio Driver";
    }

    public static AudioDriver getInstance(){
        if(audioDriver == null) return  audioDriver= new AudioDriver();
        return audioDriver;
    }
}
