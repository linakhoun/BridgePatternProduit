public class Leather implements IMaterial{

    @Override
    public String substance() {
        return String.format("It is made of real %s.", getClass().getSimpleName());
    }
}
