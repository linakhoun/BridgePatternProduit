public abstract class Product {
    protected IMaterial material;

    public Product(IMaterial material) {
        this.material = material;
    }

    abstract public String make();
}
