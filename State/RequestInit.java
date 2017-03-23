package State;

/**
 * Created by malik on 22.03.2017.
 */
public class RequestInit implements RequestState {
    @Override
    public void initialize() {
        System.out.println(getClass().getSimpleName() + " initialized!");
    }

    @Override
    public void perform() {
        System.out.println("Not implemented");
    }
}
