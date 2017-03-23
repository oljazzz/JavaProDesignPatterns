package RequestContext;

import State.RequestState;

/**
 * Created by malik on 22.03.2017.
 */
public class RequestContext implements RequestState {
    private RequestState state;

    public RequestState getState() {
        return state;
    }

    public void setState(RequestState state) {
        this.state = state;
    }

    @Override
    public void initialize() {
        this.state.initialize();
    }

    @Override
    public void perform() {
        this.state.perform();
    }
}
