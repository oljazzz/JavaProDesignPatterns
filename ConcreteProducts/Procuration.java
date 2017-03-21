package ConcreteProducts;

import AbstractProducts.Document;

/**
 * Created by malik on 21.03.2017.
 */
public class Procuration implements Document {
    @Override
    public void save() {
        System.out.println(getClass().getSimpleName() + " saved!");
    }

    @Override
    public void create() {
        System.out.println(getClass().getSimpleName() + " created!");
    }
}
