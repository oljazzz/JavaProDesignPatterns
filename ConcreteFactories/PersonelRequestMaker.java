package ConcreteFactories;

import AbstractProducts.Request;
import AbstractFactories.RequestMaker;
import ConcreteProducts.PersonelRequest;

/**
 * Created by malik on 21.03.2017.
 */
public class PersonelRequestMaker implements RequestMaker {
    @Override
    public Request createRequest() {
        return new PersonelRequest();
    }
}
