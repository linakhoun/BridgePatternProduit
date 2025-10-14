public class Cotton implements IMaterial {


    @Override
    public String substance() {
        return String.format("Il est en %s", getClass().getSimpleName());
    }
}
