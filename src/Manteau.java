public class Manteau extends Produit {

    public Manteau(IMaterial material) {
        super(material);
    }
    @Override
    public String make() {
        return String.format("Le manteau a été créé. " + material.substance());
    }
}
