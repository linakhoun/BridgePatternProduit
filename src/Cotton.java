public class Cotton implements IMaterial {


    @Override
    public String substance() {
        return String.format("It is made of 100 percent %s.", getClass().getSimpleName());
    }
}
