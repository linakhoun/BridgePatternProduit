public class Suede implements IMaterial {

    @Override
    public String substance() {
        return String.format("It is made of %s.", getClass().getSimpleName());
    }
}
