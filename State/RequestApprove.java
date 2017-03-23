package State;

/**
 * Created by malik on 22.03.2017.
 */
public class RequestApprove implements RequestState {
    @Override
    public void initialize() {
        System.out.println("Not implemented!");
    }

    @Override
    public void perform() {
        System.out.println(getClass().getSimpleName() + " performed!");
    }
}
