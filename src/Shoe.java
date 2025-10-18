public class Shoe extends Product {

    public Shoe(IMaterial material) {
        super(material);
    }

    @Override
    public String make() {
        return String.format("The shoe has been made. " + material.substance());
    }
}
