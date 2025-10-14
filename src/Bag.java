public class Bag extends Product {

    public Bag(IMaterial material) {
        super(material);
    }
    @Override
    public String make() {
        return String.format("The bag has been made. " + material.substance());
    }
}
