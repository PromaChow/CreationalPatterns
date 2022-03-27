package FcatoryAndAbstractFactory;

public class BeadJewelleryFactory implements JewelleryFactory{
    @Override
    public Earrings getEarrings() {
        return new BeadEarrings();
    }

    @Override
    public Necklace getNecklace() {
        return new BeadNecklace();
    }
}
