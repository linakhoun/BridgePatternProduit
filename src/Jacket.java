public class Jacket extends Product {

    public Jacket(IMaterial material) {
        super(material);
    }
    @Override
    public String make() {
        return String.format("The jacket has been made. " + material.substance());
    }
}
