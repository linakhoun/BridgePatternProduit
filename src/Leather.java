public class Leather implements IMaterial{

    @Override
    public String substance() {
        return String.format("Il est en %s", getClass().getSimpleName());
    }
}
