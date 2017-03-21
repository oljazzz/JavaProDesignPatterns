package ConcreteProducts;

import AbstractProducts.Request;

/**
 * Created by malik on 21.03.2017.
 */
public class ITRequest implements Request {
    @Override
    public void create() {
        System.out.println(getClass().getSimpleName() + " created!!");
    }

    @Override
    public void approve() {
        System.out.println(getClass().getSimpleName() + " approved!!");
    }

    @Override
    public void closed() {
        System.out.println(getClass().getSimpleName() + " closed!!");
    }
}
