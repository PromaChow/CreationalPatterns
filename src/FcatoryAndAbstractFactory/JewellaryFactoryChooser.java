package FcatoryAndAbstractFactory;

import java.util.HashMap;

public class JewellaryFactoryChooser {

    public JewelleryFactory chooseFactory(String type){
        if(type.equals("Antique"))return new AntiqueJewelleryFactory();
        else if(type.equals("Beads")) return new BeadJewelleryFactory();
        else return null;
    }
}
