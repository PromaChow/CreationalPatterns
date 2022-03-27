package FcatoryAndAbstractFactory;

public class MainClass {

    public static void main(String[] args){
        JewelleryFactory jewel = new JewellaryFactoryChooser().chooseFactory("Antique");
        jewel.getNecklace().wearOnNeck();
        jewel.getEarrings().wearOnEar();

    }
}
