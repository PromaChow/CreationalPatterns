package FcatoryAndAbstractFactory;

public class AntiqueJewelleryFactory implements JewelleryFactory{
    @Override
    public Earrings getEarrings() {
        return new AntiqueEarrings();
    }

    @Override
    public Necklace getNecklace() {
        return new AntiqueNecklace();
    }
}
