public class Sac extends Produit {

    public Sac(IMaterial material) {
        super(material);
    }
    @Override
    public String make() {
        return String.format("Le sac a été créé. " + material.substance());
    }
}
