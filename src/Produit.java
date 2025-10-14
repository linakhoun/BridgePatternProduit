public abstract class Produit {
    protected IMaterial material;

    public Produit(IMaterial material) {
        this.material = material;
    }

    abstract public String make();
}
