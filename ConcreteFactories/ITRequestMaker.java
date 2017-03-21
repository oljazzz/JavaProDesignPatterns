package ConcreteFactories;

import AbstractProducts.Request;
import AbstractFactories.RequestMaker;
import ConcreteProducts.ITRequest;

/**
 * Created by malik on 21.03.2017.
 */
public class ITRequestMaker implements RequestMaker {
    @Override
    public Request createRequest() {
        return new ITRequest();
    }
}
